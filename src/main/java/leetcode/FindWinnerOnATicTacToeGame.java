package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindWinnerOnATicTacToeGame {

    String[][] board;

    public String tictactoe(int[][] moves) {

        board = new String[][]{{"x", "x", "x"}, {"x", "x", "x"}, {"x", "x", "x"}};

        String res = "Pending";

        makeMoves(moves);

        if (checkRows().equals("not found")) {
            if (checkCol().equals("not found")) {
                if (checkDiag().equals("not found")) {
                    res = moves.length == 9 ? "Draw" : res;
                } else res = checkDiag();
            } else res = checkCol();
        } else res = checkRows();

        return res;
    }


    public String checkDiag() {
        String res = "";

        int idxC = 0;
        int idxr = 0;

        Set<String> innerSetDiagL = new HashSet<>();
        Set<String> innerSetDiagR = new HashSet<>();

        while (idxC < 3) {
            innerSetDiagL.add(board[idxr][idxC]);

            idxr++;
            idxC++;
        }

        idxr = 0;
        idxC = 2;

        while (idxr < 3) {
            innerSetDiagR.add(board[idxr][idxC]);
            // 0:0, 1:1 2:2:
            //0:2, 1:1, 2:0

            idxr++;
            idxC--;

        }

        String resL = innerSetDiagL.stream().iterator().next();
        String resR = innerSetDiagR.stream().iterator().next();

        if (innerSetDiagL.size() == 1 && resL!="x") {
            res = resL;
        } else if (innerSetDiagR.size() == 1 && resR!="x") {
            res = resR;
        } else res = "not found";
        return res;
    }

    public String checkCol() {

        for (int i = 0; i < 3; i++) {
            Set<String> innerSetCol = new HashSet<>();
            for (int j = 0; j < 3; j++) {
                innerSetCol.add(board[j][i]);
            }
            String resC = innerSetCol.stream().iterator().next();
            if (innerSetCol.size() == 1 && resC!="x") {
                return resC;
            }

        }
        return "not found";
    }

    public String checkRows() {
        for (int i = 0; i < 3; i++) {
            Set<String> innerSet = new HashSet<>(Arrays.asList(board[i]).subList(0, 3));

            String res = innerSet.stream().iterator().next();

            if (innerSet.size() == 1 && res!="x") {
                return res;
            }
        }
        return "not found";
    }

    public void makeMoves(int[][] moves) {
        for (int i = 0; i < moves.length; i++) {

            int a = moves[i][0];
            int b = moves[i][1];

            if (i % 2 == 0) {
                board[a][b] = "A";
            } else board[a][b] = "B";

        }

    }

    public static void main(String[] args) {
        FindWinnerOnATicTacToeGame tic = new FindWinnerOnATicTacToeGame();
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};


        tic.tictactoe(moves);

    }

}

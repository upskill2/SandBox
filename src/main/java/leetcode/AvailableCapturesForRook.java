package leetcode;

public class AvailableCapturesForRook {

    public int numRookCaptures(char[][] board) {

        int[] rookArr = findRookIndex(board);

        int resRow = checkHorizontally(rookArr[0], rookArr[1] - 1, board);
        int resCol = checkVertically(rookArr[0] - 1, rookArr[1], board);


        return resRow + resCol;
    }

    private static int checkVertically(int row, int col, char[][] board) {

        int idx = row + 2;
        int res = 0;

        while (row > -1) {

            if (board[row][col] == 'p') {
                res = 1;
                break;
            } else if (board[row][col] != '.') {
                break;
            }
            row--;
        }

        while (idx < 8) {

            if (board[idx][col] == 'p') {
                res = res + 1;
                break;
            } else if (board[idx][col] != '.') {
                break;
            }
            idx++;
        }

        return res;
    }

    private static int checkHorizontally(int row, int col, char[][] board) {

        int idx = col + 2;
        int res = 0;

        while (col > -1) {

            if (board[row][col] == 'p') {
                res = 1;
                break;
            } else if (board[row][col] != '.') {
                break;
            }
            col--;
        }

        while (idx < 8) {

            if (board[row][idx] == 'p') {
                res++;
                break;
            } else if (board[row][idx] != '.') {
                break;
            }
            idx++;
        }


        return res;

    }

    private static int[] findRookIndex(char[][] brd) {

        int[] arr = new int[2];

        for (int i = 0; i < brd.length; i++) {
            for (int j = 0; j < brd[0].length; j++) {
                if (brd[i][j] == 'R') {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {

        AvailableCapturesForRook avr = new AvailableCapturesForRook();

        char[][] board = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', 'p', 'R', 'p', '.', 'p', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };

        avr.numRookCaptures(board);

    }

}

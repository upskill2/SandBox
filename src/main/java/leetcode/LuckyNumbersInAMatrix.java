package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LuckyNumbersInAMatrix {

    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> resList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();


        //find max in column
        for (int i = 0; i < matrix[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
                if (j == matrix.length - 1) {
                    colList.add(max);
                }
            }
        }


        // find mix in a row
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
            resList.add(matrix[i][0]);
        }

        resList = resList.stream()
                .distinct()
                .filter(colList::contains)
                .collect(Collectors.toList());
        return resList;


    }

    public static void main(String[] args) {
        LuckyNumbersInAMatrix luc = new LuckyNumbersInAMatrix();

        int[][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        int[][] matrix1 = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        int[][] matrix2 = {{3, 6}, {7, 1}, {5, 2}, {4, 8}};

        luc.luckyNumbers(matrix);
        luc.luckyNumbers(matrix1);
        luc.luckyNumbers(matrix2);

    }
}

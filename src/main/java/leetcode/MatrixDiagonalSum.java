package leetcode;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {

        int sum = 0;

        int idx = mat[0].length - 1;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i] + mat[i][idx--];  ///0-2, 1-1, 2-0
            // sumRight += mat[i][idx--];
        }

        if (mat[0].length * mat.length % 2 != 0) {
            idx = (mat.length) / 2;
            sum -= mat[idx][idx];
        }

        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum dia = new MatrixDiagonalSum();

        int[][] mat =
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        int[][] mat1 = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};

        int[][] mat2 =
                {{5}};

   //     dia.diagonalSum(mat);
        dia.diagonalSum(mat1);
        dia.diagonalSum(mat2);
    }
}

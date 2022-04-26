package leetcode;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int row_lenght = mat.length;
        int column_lenght = mat[0].length;

        if (row_lenght * column_lenght != r * c) {
            return mat;
        }

        int[][] arr_result = new int[r][c];

        int arr_column = 0;
        int arr_row = 0;

        for (int i = 0; i < row_lenght; i++) {
            for (int j = 0; j < column_lenght; j++) { //{1, 2}, {3, 4} r=1
                arr_result[arr_row][arr_column] = mat[i][j];
                    arr_column++;
                    if(arr_column==c){
                        arr_row++;
                        arr_column=0;
                    }
            }
        }


        return arr_result;
    }

    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};
        int r = 2;
        int c = 2;


        new ReshapeTheMatrix().matrixReshape(mat, r, c);

    }

}

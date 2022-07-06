package leetcode;

public class SpecialPositionsInABinaryMatrix {

    public int numSpecial(int[][] mat) {


        int sum = 0;
        int idx = -1;

        for (int i = 0; i < mat.length; i++) {
            int r = 0;
            int c = 0;

            for (int j = 0; j < mat[0].length; j++) {
                r += mat[i][j];
                idx = mat[i][j] == 1 ? j : idx;
                if (j == mat[0].length - 1 && r == 1) {
                    for (int k = 0; k < mat.length; k++) {
                        c += mat[k][idx];
                        if (k == mat.length - 1 && c == 1) {
                            sum++;
                        }

                    }
                }
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        SpecialPositionsInABinaryMatrix spe = new SpecialPositionsInABinaryMatrix();

        int[][] mat =
                {{1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}};

        int[][] mat1 =
               {{1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}};
        int[][] mat2 =
                {{0, 0, 1, 0},
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {0, 1, 0, 0}};

        int[][] mat3 =
                       {{0, 0},
                        {0, 0},
                        {1, 0}};


/*        spe.numSpecial(mat1);
         spe.numSpecial(mat);
          spe.numSpecial(mat2);*/
          spe.numSpecial(mat3);
    }
}

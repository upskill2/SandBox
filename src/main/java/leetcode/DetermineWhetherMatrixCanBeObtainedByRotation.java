package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    public boolean findRotation(int[][] mat, int[][] target) {

        if (Arrays.deepEquals(mat, target)) {
            return true;
        }

        int idx = 0;
        int len = target.length;
        while (idx++ < 3) {
            int[][] ar = new int[len][target[0].length];

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {

                    ar[j][target[0].length - i - 1] = mat[i][j];
                }

            }

            if (Arrays.deepEquals(ar, target)) {
                return true;
            } else {
                mat=ar;
            }

        }


        return false;
    }


    public static void main(String[] args) {
        DetermineWhetherMatrixCanBeObtainedByRotation set = new DetermineWhetherMatrixCanBeObtainedByRotation();

        int[][] mat = {{0, 1}, {1, 0}}, target = {{1, 0}, {0, 1}};
        int[][] mat1 = {{0, 1}, {1, 1}}, target1 = {{1, 0}, {0, 1}};


        int[][] mat2 = {{0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}}, target2 = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};

        int[][] mat3 = {{1, 1}, {0, 1}}, target3 = {{1, 1}, {1, 0}};


        //   int[][] mat2 = {{1, 0, 0},
        //              {1, 1, 0},
        //              {1, 0, 0}}, target2 = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};


        // 0:0 -> 0:2
        // 0:1 -> 1:2
        // 0:2 -> 2:2

        // 1:0 -> 0:1
        // 1:1 -> 1:1
        // 1:2 -> 2:1

        // 2:0 -> 0:0
        // 2:1 -> 0:1
        // 2:2 -> 0:2

        //   set.findRotation(mat, target);
        //  set.findRotation(mat1, target1);
    set.findRotation(mat2, target2);
        set.findRotation(mat3, target3);
    }
}

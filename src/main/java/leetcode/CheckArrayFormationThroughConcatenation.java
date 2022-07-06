package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CheckArrayFormationThroughConcatenation {

    public boolean canFormArray(int[] arr, int[][] pieces) {

        boolean check = true;

        for (int i = 0; i < pieces.length; i++) {
            if (!check) {
                return false;
            }
            check = false;

            for (int j = 0; j < arr.length; j++) {
                if (pieces[i][0] == arr[j]) {  //{{78}, {4, 64}, {91}};
                    check = Arrays.equals(compArr(arr, j, pieces[i].length), pieces[i]);
                    break;
                }

            }
        }

        return check;
    }

    private int[] compArr(int[] ar, int idxStart, int idxLen) {

        int[] newArr = new int[idxLen];

        if (idxLen == 1) {
            newArr[0] = ar[idxStart];
            return newArr;
        }


        int idx = 0;
        for (int i = idxStart; i < idxStart + idxLen; i++) {
            int num = 0;
            try {
                num = ar[i];}
            catch (ArrayIndexOutOfBoundsException e) {
                    return  newArr;
            }

            newArr[idx] = num;
            idx++;
        }

        return newArr;

    }

    public static void main(String[] args) {
        CheckArrayFormationThroughConcatenation con = new CheckArrayFormationThroughConcatenation();


        int[] arr1 = {15, 88};
        int[][] pieces1 = {{88}, {15}};

        int[] arr2 = {49, 18, 16};
        int[][] pieces2 = {{16, 18, 49}};

        int[] arr = {91, 4, 64, 78};
        int[][] pieces = {{78}, {4, 64}, {91}};

        int[] arr3 = {2, 82, 79, 95, 28};
        int[][] pieces3 = {{2}, {82}, {28}, {79, 95}};

        int[] arr4 = {37, 69, 3, 74, 46};
        int[][] pieces4 = {{37, 69, 3, 74, 46}};

        int[] arr5 = {91, 2, 4, 64, 5, 78, 12, 9};
        int[][] pieces5 = {{78, 12, 3}, {4, 64, 5}, {91, 2}};

        int[] arr6 = {1, 2, 3};
        int[][] pieces6 = {{2}, {1, 3}};


        //     con.canFormArray(arr1, pieces1);
        con.canFormArray(arr2, pieces2);
        //   con.canFormArray(arr, pieces);
        //     con.canFormArray(arr3, pieces3);
        //con.canFormArray(arr4, pieces4);
        //con.canFormArray(arr5, pieces5);
        //    con.canFormArray(arr6, pieces6);
    }
}


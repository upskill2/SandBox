package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {


        List<Integer> lst = new ArrayList<>();
        for (int r: arr
             ) {lst.add(r);

        }
        if(lst.contains(0)){
            lst.remove(lst.indexOf(0));
        }

        for (int i = 0; i < arr.length; i++) {
            int dig = arr[i] * 2;
            if (lst.contains(dig)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist dbl = new CheckIfNAndItsDoubleExist();

        int[] arr = {10, 2, 5, 3};
        int[] arr1 = {3, 1, 7, 11};
        int[] arr2 = {-2, 0, 10, -19, 4, 6, -8};
        int[] arr3 = {0, 0};
        int[] arr4 = {-20,8,-6,-14,0,-19,14,4};
/*
        //     dbl.checkIfExist(arr);
        //   dbl.checkIfExist(arr1);
        dbl.checkIfExist(arr2);
        dbl.checkIfExist(arr3);*/
        dbl.checkIfExist(arr4);

    }
}

package leetcode;

import javax.lang.model.element.Element;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateZeros {

   ArrayList<Integer> list;

    public void duplicateZeros(int[] arr) {

        createArrayCopy(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);
        }
       int r = 4;

    }

    private void createArrayCopy(int[] nums){

       list = new ArrayList<>();
        for (int e : nums
        ) {
            list.add(e);
        }

        int idx = 0;
        int IdxFinal =0;
        for (int i = 0; i < nums.length; i++) {
            IdxFinal=i+idx;
            if (nums[i] == 0) {
                list.add(IdxFinal, 0);
                idx++;
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};


        DuplicateZeros dupe = new DuplicateZeros();
        dupe.duplicateZeros(arr);

    }
}

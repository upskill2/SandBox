package leetcode;

import java.util.*;

public class DetectPatternOfLengthMRepeatedKOrMoreTimes {
    public boolean containsPattern(int[] arr, int m, int k) {

        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        int freq = 1;

        for(int i=0; i<arr.length; i++){
            if(i>=m){
                if(arr[i]==q.poll())
                {
                    count++;
                    if(count==m){
                        freq++;
                        count = 0;
                    }
                    if(freq==k)
                        return true;
                }
                else{
                    count =0;
                    freq=1;
                }
            }
            q.offer(arr[i]);
        }
        return false;



/*        List<List<Integer>> listPreviousInput = new ArrayList<>();

        //fill the map
        fillInTheMap(m, arr, k, listPreviousInput);

        listPreviousInput.removeIf(List::isEmpty);


        if (listPreviousInput.size() >= k) {
            return true;
        }

        return false;*/
    }

    private void fillInTheMap(int len, int[] arr, int freq, List<List<Integer>> listPreviousInput) {


        int lastIndex = 0;
        int firstIndex = 0;

        for (int j = 0; j < len; j++) {
            listPreviousInput.clear();
            for (int i = j; i < arr.length; i += len) {

                firstIndex = i;
                if (i + len - 1 >= arr.length) {
                    lastIndex = arr.length - 1;
                } else {
                    lastIndex = i + len - 1;
                }

                List<Integer> list = new ArrayList<>();
                list.add(arr[firstIndex]);
                if (len > 1) {
                    for (int k = firstIndex+1; k <= lastIndex; k++) {
                        list.add(arr[k]);
                    }

                }



                if (i != 0 & !listPreviousInput.isEmpty()) {

                    if (listPreviousInput.get(0).equals(list)) {
                        listPreviousInput.add(list);

                    } else {
                        listPreviousInput.clear();
                        listPreviousInput.add(list);
                    }

                } else {
                    listPreviousInput.add(list);
                }

                if (listPreviousInput.size() >= freq) {
                    return;
                }


            }
        }


    }

    public static void main(String[] args) {
        DetectPatternOfLengthMRepeatedKOrMoreTimes det = new DetectPatternOfLengthMRepeatedKOrMoreTimes();

        int[] arr = {1, 2, 1, 2, 1, 1, 1, 3};
        int m = 2, k = 2;

        int[] arr1 = {1, 2, 3, 1, 2};
        int m1 = 2, k1 = 2;

        int[] arr2 = {2, 2, 1, 2, 2, 1, 1, 1, 2, 1};
        int m2 = 2, k2 = 2;

        int[] arr3 = {1, 2, 4, 4, 4, 4};
        int m3 = 1, k3 = 3;

        int[] arr4 = {1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 3, 1, 1};
        int m4 = 2, k4 = 2;

        int[] arr5 = {3, 6, 6, 6, 5, 1, 5, 2, 2, 3, 1, 5, 2, 6, 1, 5, 1, 2, 6, 3, 3, 5, 3, 6, 3, 4};
        int m5 = 6, k5 = 2;

   //     det.containsPattern(arr, m, k);
    //    det.containsPattern(arr1, m1, k1);
//        det.containsPattern(arr2, m2, k2);
   //        det.containsPattern(arr3, m3, k3);
        det.containsPattern(arr4, m4, k4);
   //    det.containsPattern(arr5, m5, k5);
    }
}

package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {

        ArrayList<Integer> numsList = new ArrayList(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int n : nums
        ) {
            myMap.put(n, myMap.getOrDefault(n, 0) + 1);
        }

        int maxValue = Collections.max(myMap.values());

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                list.add(entry.getKey());
            }
        }

        int result = 0;


        int num1 = Integer.MAX_VALUE;
        int num2 = 0;
        if(list.size()==1){
            result =  numsList.lastIndexOf(list.get(0)) - numsList.indexOf(list.get(0))+1;
        } else for (int n : list ) {
            num2 = numsList.lastIndexOf(n) - numsList.indexOf(n)+1;
            result = Math.min(num1,num2);
            num1=result;
        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 1, 3, 2};
        new DegreeOfAnArray().findShortestSubArray(nums);
    }

}

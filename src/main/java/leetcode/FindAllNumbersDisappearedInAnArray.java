package leetcode;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {


        int len = nums.length;
        Set<Integer> set2 = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> list1 = new ArrayList<>();

        int idx2 = 1;
        while (idx2 <= len) {
            if(!set2.contains(idx2)){
                list1.add(idx2);
            }
            idx2++;
        }

        Set<Integer> set1 = new HashSet(Arrays.asList(nums)); // All in index 0

        List<Integer> list = new ArrayList<>();

        int temp = 0;
        for (int i = len - 1; i > -1; i--) {  //{4, 3, 2, 7, 8, 2, 3, 1}
            for (int j = i; j > -1; j--) {

                if (nums[i] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }
        }


        List<Integer> list2 = new ArrayList<>();

        long idx1 = 1;
        while (idx1 <= len) {
            if (!contains(nums, idx1)) {
                list2.add((int) idx1);
            }
            idx1++;
        }


        return list2;
    }

    public boolean contains(int[] arr, long key) {
        boolean found = false;

        for (long i = 0; i < arr.length; i++) {
            if (arr[(int) i] == key) {
                found = true;
            }
        }

        return found; //Arrays.stream(arr).anyMatch(i->i==key);
    }

    public static void main(String[] args) throws FileNotFoundException {

        FindAllNumbersDisappearedInAnArray fa = new FindAllNumbersDisappearedInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        File file = new File("src/main/java/leetcode/resources/BigArray.txt");


        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        List<String> list6 = new ArrayList();


        fa.findDisappearedNumbers(nums);
    }

}



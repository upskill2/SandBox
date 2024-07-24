
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main3 {


    public static int removeElement(int[] nums, int val) {

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                int temp = nums[idx];
                nums[idx] = val;
                nums[i] = temp;
                idx++;
            }
        }
        return nums.length - idx;
    }

    public static int[] findMaxMin(int[] myList) {
        int[] res = new int[2];

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < max) {
                max = myList[i];
            }
            if (myList[i] > min) {
                min = myList[i];
            }

        }
        res[0] = min;
        res[1] = max;

        return res;
    }

    public static String findLongestString(String[] stringList) {

        return Arrays.stream(stringList)
                .max(Comparator.comparingInt(String::length))
                .orElse("");

    }

    public static int removeDuplicates(int[] nums) {
        return (int) Arrays.stream(nums)
                .distinct()
                .count();
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        int idxMin = Integer.MAX_VALUE;
        int idxMax = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < idxMin) {
                idxMin = prices[i];
                idxMax = prices[i];
            } else {
                idxMax = prices[i];
            }
            int temp = idxMax - idxMin;
            if (temp > profit) {
                profit = temp;
            }
        }
        return profit;
    }


    public static void rotate(int[] nums, int k) {

        if (k > nums.length) {
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + k >= nums.length) {
                map.put(i + k - nums.length, nums[i]);
            } else {
                map.put(i + k, nums[i]);
            }

        }

        for (Map.Entry entry : map.entrySet()) {
            final int key = (int) entry.getKey();
            final int value = (int) entry.getValue();
            nums[key] = value;
        }
        System.out.println();

    }

    public static int maxSubarray(int[] nums) {
        if (nums.length == 0) return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int temp1 = 0;
            for (int j = i + 1; j < nums.length; j++) {
                temp1 += nums[j];
                temp = Integer.max(temp, temp + temp1);
                System.out.println();
            }
            max = Integer.max(temp, max);
        }

        int maxSum = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

     //   return maxSum;

        return max;
    }

    public static void main(String[] args) {

        // Example 1: Simple case with positive and negative numbers
        int[] inputCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = maxSubarray(inputCase1);
        System.out.println("Example 1: Input: " + Arrays.toString(inputCase1) + "\nResult: " + result1);


      /*  int[] nums3 = {1, 2};
        int k3 = 3;
        rotate(nums3, k3);
        System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"


        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"
*/
       /* int[] prices1 = {7, 1, 5, 3, 6, 4};
        int profit1 = maxProfit(prices1);
        System.out.println("Test case 1: Maximum profit: " + profit1); // prints "Maximum profit: 5"

        String[] stringList1 = {"apple", "banana", "kiwi", "pear"};
        String longest1 = findLongestString(stringList1);
        System.out.println("Test case 1: Longest string: " + longest1);  // prints "banana"

        String[] stringList2 = {"cat", "giraffe", "elephant", "hippopotamus"};
        String longest2 = findLongestString(stringList2);
        System.out.println("Test case 2: Longest string: " + longest2);  // prints "hippopotamus"

        String[] stringList3 = {"sun", "moon", "planet", "universe"};
        String longest3 = findLongestString(stringList3);
        System.out.println("Test case 3: Longest string: " + longest3);  // prints "universe"

        String[] stringList4 = {"java", "python", "javascript", "c"};
        String longest4 = findLongestString(stringList4);
        System.out.println("Test case 4: Longest string: " + longest4);  // prints "javascript"

        String[] stringList5 = {"", "a", "aa", "aaa"};
        String longest5 = findLongestString(stringList5);
        System.out.println("Test case 5: Longest string: " + longest5);


        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"

        int[] myList2 = {-5, -3, -8, -1, -6, -9};
        int[] result2 = findMaxMin(myList2);
        System.out.println("Test case 2: MaxMin: " + Arrays.toString(result2)); // prints "[-1, -9]"

        int[] myList3 = {0, 0, 0, 0, 0};
        int[] result3 = findMaxMin(myList3);
        System.out.println("Test case 3: MaxMin: " + Arrays.toString(result3)); // prints "[0, 0]"

        int[] myList4 = {100, 200, 300, 400, 500};
        int[] result4 = findMaxMin(myList4);
        System.out.println("Test case 4: MaxMin: " + Arrays.toString(result4)); // prints "[500, 100]"

        // Test case 1
        int[] nums14 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int val1 = 1;
        int newLength1 = removeElement(nums14, val1);
        System.out.println("Test case 1: Modified array: " +
                Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)) +
                "\nNew length: " + newLength1);

        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int val2 = 6;
        int newLength2 = removeElement(nums2, val2);
        System.out.println("Test case 2: Modified array: " +
                Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)) +
                "\nNew length: " + newLength2);

        // Test case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int val3 = -1;
        int newLength3 = removeElement(nums3, val3);
        System.out.println("Test case 3: Modified array: " +
                Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)) +
                "\nNew length: " + newLength3);

        // Test case 4
        int[] nums4 = {};
        int val4 = 1;
        int newLength4 = removeElement(nums4, val4);
        System.out.println("Test case 4: Modified array: " +
                Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)) +
                "\nNew length: " + newLength4);

        // Test case 5
        int[] nums5 = {1, 1, 1, 1, 1};
        int val5 = 1;
        int newLength5 = removeElement(nums5, val5);
        System.out.println("Test case 5: Modified array: " +
                Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)) +
                "\nNew length: " + newLength5);*/
    }
}

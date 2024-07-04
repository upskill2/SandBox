import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class Main {

    public static Logger logger = Logger.getLogger(Main.class.getName());

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {

        List<int[]> res = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], arr2[i]);
        }

        for (int i = 0; i < arr1.length; i++) {

            final int key = target - arr1[i];
            if (map.containsKey(key)) {
                int[] temp = {target - arr1[i], arr1[i]};
                res.add(temp);
            }
        }


        return res;

    }

    public static int longestConsecutiveSequence(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }

        if(set.size()==1) return 1;

        int max = 0;

        int prev = 0;
        int temp = 0;
        for (int num: set){
            final int i = num - prev;
            if(i ==1){
                prev = num;
                temp++;
                max = Integer.max(max, temp);
            } else {
                temp =1;
                prev = num;
            }
        }

            return max;

    }


    public static Character firstNonRepeatingChar(String s) {
        if (s.length() == 0) return null;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        String[] arr = new String[10];
        int ls = arr.length;

        Map<Character, Integer> chars = new HashMap<>();
        chars.put('a', 1);
        chars.put('b', 2);
        chars.put('c', 3);
        chars.put('d', 4);
        chars.put('e', 5);
        chars.put('f', 6);
        chars.put('g', 7);
        chars.put('h', 8);
        chars.put('i', 9);
        chars.put('j', 10);
        chars.put('k', 11);
        chars.put('l', 12);
        chars.put('m', 13);
        chars.put('n', 14);
        chars.put('o', 15);
        chars.put('p', 16);
        chars.put('q', 17);
        chars.put('r', 18);
        chars.put('s', 19);
        chars.put('t', 20);
        chars.put('u', 21);
        chars.put('v', 22);
        chars.put('w', 23);
        chars.put('x', 24);
        chars.put('y', 25);
        chars.put('z', 26);


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) return ch;
        }

        return null;
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<Character, Integer> chars = new HashMap<>();
        chars.put('a', 1);
        chars.put('b', 2);
        chars.put('c', 3);
        chars.put('d', 4);
        chars.put('e', 5);
        chars.put('f', 6);
        chars.put('g', 7);
        chars.put('h', 8);
        chars.put('i', 9);
        chars.put('j', 10);
        chars.put('k', 11);
        chars.put('l', 12);
        chars.put('m', 13);
        chars.put('n', 14);
        chars.put('o', 15);
        chars.put('p', 16);
        chars.put('q', 17);
        chars.put('r', 18);
        chars.put('s', 19);
        chars.put('t', 20);
        chars.put('u', 21);
        chars.put('v', 22);
        chars.put('w', 23);
        chars.put('x', 24);
        chars.put('y', 25);
        chars.put('z', 26);

        Map<Integer, List<String>> map = new HashMap<>();


        for (String s : strings) {
            int key = 0;
            for (int k = 0; k < s.length(); k++) {
                key += chars.get(s.charAt(k));
                if (k == s.length() - 1) {
                    if (!map.containsKey(key)) {
                        List<String> newLst = new ArrayList<>();
                        newLst.add(s);
                        map.put(key, newLst);
                    } else {
                        List<String> lst = map.get(key);
                        lst.add(s);
                        map.put(key, lst);
                    }
                }
            }
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String string : strings) {
            char[] chars1 = string.toCharArray();

            Arrays.sort(chars1);
            String canonical = new String(chars1);

            if (anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();

                group.add(string);
                anagramGroups.put(canonical, group);
            }
        }

        final List<List<String>> values = new ArrayList<>(map.values());
        return values;

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }

        int[] res = new int[2];
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            int idx = i.getKey();
            for (Map.Entry<Integer, Integer> i2 : map.entrySet()) {
                int idx2 = i2.getKey();
                if (idx2 == idx) {
                    break;
                }
                if (i.getValue() + i2.getValue() == target) {
                    res[0] = i.getKey();
                    res[1] = i2.getKey();
                    break;
                }

            }
        }

        if (res[0] == 0 && res[1] == 0) {
            return new int[0];
        }

        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(num, i);
        }

        return res;
    }

    public static int[] subarraySum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (map.containsKey(currentSum - target)) {
                final int[] ints = {map.get(currentSum - target) + 1, i};
                return ints;
            }
            map.put(currentSum, i);
        }

        return new int[]{};
    }

    public static List<Integer> removeDuplicates(List<Integer> myList) {

        final Set<Integer> collect = myList.stream().collect(Collectors.toSet());
        Set<Integer> ints = new HashSet<>(myList);

        return collect.stream().toList();

    }

    public static boolean hasUniqueChars(String string) {
        Set<Character> set = string.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        return set.size() == string.length();
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        int[] arr1 = {1, 2, 3, 4, 5, 4};
        int[] arr2 = {2, 4, 6, 8, 10, 3};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);

        System.out.println(longestConsecutiveSequence(new int[]{ 1, 0, -1, -2, -3 }));

    }

}

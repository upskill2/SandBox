package leetcode;

import java.util.*;

public class MinimumIndexSumOfTwoListsTest {

    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<Integer, List<String>> mapFinal = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!mapFinal.containsKey(i + j)) {
                        mapFinal.put(i + j, new ArrayList<String>());
                    } mapFinal.get(i + j).add(list1[i]);
                }
            }
        }

        return list1;
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        String[] list1 = {"Bla", "Tik", "Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Tik", "Bla", "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        new MinimumIndexSumOfTwoListsTest().findRestaurant(list1, list2);
    }

}

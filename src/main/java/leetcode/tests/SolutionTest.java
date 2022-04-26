package leetcode.tests;

public class SolutionTest {

    public static void main(String[] args) {

        String[] list1 = {"Bla", "Tik", "Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Tik", "Bla", "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};

        new Solution().findRestaurant(list1,list2);
    }

}

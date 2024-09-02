package course;

public class MinimumInRotatedSortedArray {
    public int minimum(int[] arr) {
        int start = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int i1 = arr[i];
            if (i1 < start) {
                return i1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        MinimumInRotatedSortedArray minimumInRotatedSortedArray = new MinimumInRotatedSortedArray();
        System.out.println(minimumInRotatedSortedArray.minimum(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }
}

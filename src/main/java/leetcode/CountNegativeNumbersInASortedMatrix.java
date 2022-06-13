package leetcode;

public class CountNegativeNumbersInASortedMatrix {

    public int countNegatives(int[][] grid) {
        int res = 0;
        int idx = 0;

        int mid = grid[0].length / 2;
        for (int i = 0; i < grid.length; i++) {
            idx = binarySearch(grid[i], mid);

            res += grid[0].length - idx;
            int y = 0;

        }

        return res;
    }

    private int binarySearch(int[] arr, int mid) {

        if (mid < arr.length) {

            if (arr[mid] < 0 && (mid == 0 || arr[mid - 1] >= 0)) {
                return mid;
            } else if (arr[mid] < 0) {
                return binarySearch(arr, mid - 1);
            } else {
                return
                        binarySearch(arr, mid + 1);
            }
        }

        return arr.length;
    }


    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix mtx = new CountNegativeNumbersInASortedMatrix();

        int[][] grid = {{
                4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        int[][] grid1 = {{3, 2}, {1, 0}};

        int[][] grid2 = {{-1}};

        int[][] grid3 = {{5, 3, 2}, {-1, -4, -5}};

        int[][] grid4 = {{
                3, -1, -3, -3, -3}, {2, -2, -3, -3, -3}, {1, -2, -3, -3, -3}, {0, -3, -3, -3, -3}};

        int[][] grid5 = {{
                0, -3, -3, -3, -3}};

        mtx.countNegatives(grid1);

        mtx.countNegatives(grid5);

/*        mtx.countNegatives(grid);
        mtx.countNegatives(grid2);
        mtx.countNegatives(grid3);
        mtx.countNegatives(grid4);*/
    }

}

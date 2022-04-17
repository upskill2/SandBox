package leetcode;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;
        int dedection = 0;
        int numberOfColumns = grid.length;
        int numberOfRows = grid[0].length;


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i != 0 && grid[i - 1][j] == 1 && j != 0 && grid[i][j - 1] == 1) {
                        dedection -= 4;
                    } else if (j != 0 && grid[i][j - 1] == 1) {
                        dedection -= 2;
                    } else if (i != 0 && grid[i - 1][j] == 1) {
                        dedection -= 2;
                    }

                }
            }
        }

        return perimeter + dedection;
    }


    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] grid1 = {{0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}};
        int[][] grid2 = {{1}};
        int[][] grid3 = {{1, 0}};
        int[][] grid4 = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int[][] grid5 = {{0, 1}};

        IslandPerimeter isl = new IslandPerimeter();
//        isl.islandPerimeter(grid);
        //      isl.islandPerimeter(grid1);
        //     isl.islandPerimeter(grid2);
  //      isl.islandPerimeter(grid3);
        //  isl.islandPerimeter(grid4);
        isl.islandPerimeter(grid5);
    }

}

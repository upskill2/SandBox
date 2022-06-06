package leetcode;

import java.lang.reflect.Array;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> resOuter = new ArrayList<>();

        int m = grid.length;
        int n = grid[0].length;


        List<Integer> lst = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                lst.add(grid[i][j]);
            }
        }

        while (k > 0) {
            if (k / 3 > 0) {
                Collections.rotate(lst, 3);
                k -= 3;
            } else {
                Collections.rotate(lst, k);
                k = 0;
            }
        }

        int idxStart = 0;
        int idxEnd = n;

        while (idxStart < lst.size()) {
            resOuter.add(lst.subList(idxStart, idxEnd));
            idxStart += n;
            idxEnd += n;
        }

        return resOuter;

    }

    public static void main(String[] args) {
        Shift2DGrid shf = new Shift2DGrid();

        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] grid1 = {{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}};
        int[][] grid2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] grid3 = {{1}, {2}, {3}, {4}, {7}, {6}, {5}};
        int k = 1;
        int k1 = 4;
        int k2 = 9;
        int k3 = 23;

        shf.shiftGrid(grid, k);
        shf.shiftGrid(grid1, k1);
        shf.shiftGrid(grid2, k2);
        shf.shiftGrid(grid3, k3);
    }

}

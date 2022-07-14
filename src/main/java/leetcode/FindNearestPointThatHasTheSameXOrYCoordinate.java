package leetcode;

import java.util.PriorityQueue;

public class FindNearestPointThatHasTheSameXOrYCoordinate {

    public int nearestValidPoint(int x, int y, int[][] points) {

        int res = -1;
        int temp = -1;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]);

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];

            if (x1 == x || y1 == y) {

                int[] temp1 = new int[2];
                temp1[0] = i;
                int distance = Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                temp1[1] = distance;
                pq.add(temp1);

                int ManhattanDist = Math.abs(x1 - x) + Math.abs(y1 - y);

                if (res == -1) {
                    res = i;
                    temp = ManhattanDist;
                } else if (ManhattanDist < temp) {
                    res = i;
                    temp = ManhattanDist;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FindNearestPointThatHasTheSameXOrYCoordinate d = new FindNearestPointThatHasTheSameXOrYCoordinate();

        int x = 3, y = 4;
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};

        d.nearestValidPoint(x, y, points);
    }
}

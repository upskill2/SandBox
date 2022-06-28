package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathCrossing {
    public boolean isPathCrossing(String path) {

        List<List<Integer>> outerL = new ArrayList<>();
        int x = 0;
        int y = 0;

        List<Integer> inner = new ArrayList<>();
        inner.add(x);
        inner.add(y);
        outerL.add(inner);


        for (int i = 0; i < path.length(); i++) {
            List<Integer> innerL = new ArrayList<>();

            Character pth = path.charAt(i);

            switch (pth) {

                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'W':
                    x++;
                    break;
                case 'E':
                    x--;
                    break;
            }
            innerL.add(x);
            innerL.add(y);

            if (outerL.contains(innerL)) {
                    return true;
            }

            outerL.add(innerL);
        }

        return false;
    }

    public static void main(String[] args) {
        PathCrossing pa = new PathCrossing();

        String path = "NESWW";

        pa.isPathCrossing(path);
    }
}

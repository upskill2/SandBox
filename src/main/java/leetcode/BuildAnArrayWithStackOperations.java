package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();

        int previous = 1;
        for (int i = 0; i < target.length; i++) {
            for (int j = previous; j < n + 1; j++) {
                if (target[i] == j) {
                    list.add("Push");
                    previous = j + 1;
                    break;
                } else {
                    list.add("Push");
                    list.add("Pop");
                }

            }
        }

        return list;
    }

    public static void main(String[] args) {
        BuildAnArrayWithStackOperations build = new BuildAnArrayWithStackOperations();

        int[] target = {1, 3};
        int n = 3;

        int[] target1 = {1, 2, 3};
        int n1 = 3;

        int[] target2 = {1, 2};
        int n2 = 4;


      //  build.buildArray(target, n);
       // build.buildArray(target1, n1);
        build.buildArray(target2, n2);
    }
}

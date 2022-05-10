package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {

    List<List<Integer>> resultOuterList;
    private int prevEnd;

    public List<List<Integer>> largeGroupPositions(String s) {
        int count;
        int beg = 0;
        int end = 0;

        resultOuterList = new ArrayList<>();

        System.out.println(resultOuterList.toString());


        for (int i = 0; i < s.length(); i++) {
            addIntoList(beg, end);
            beg = 0;
            end = 0;
            count = 0;
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    if (count > 2) {
                        beg = i;
                        end = j;
                    }
                } else {
                    break;
                }
            }
        }

        System.out.println(resultOuterList);

        return resultOuterList;
    }

    public void addIntoList(int beginning, int end) {
        if (end - beginning + 1 > 2) {
            if (end != prevEnd) {
                resultOuterList.add(new ArrayList<>());
                int size = resultOuterList.size();
                resultOuterList.get(size - 1).add(0, beginning);
                resultOuterList.get(size - 1).add(1, end);
                prevEnd = end;
            }
        }

    }

    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        new PositionsOfLargeGroups().largeGroupPositions(s);
    }

}
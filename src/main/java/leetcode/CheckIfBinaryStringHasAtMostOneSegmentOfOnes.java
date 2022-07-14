package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    public boolean checkOnesSegment(String s) {


        List<String > list =new  ArrayList<>(List.of(s.split("0"))) ;
        list.remove("");

        return list.size()==1;

    }

    public static void main(String[] args) {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes cv = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();

        String s = "1001";
        String s1 = "110";
        String s2 = "1000";

   cv.checkOnesSegment(s);
        cv.checkOnesSegment(s1);
        cv.checkOnesSegment(s2);
    }

}

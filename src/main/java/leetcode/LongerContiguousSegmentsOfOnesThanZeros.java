package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {

        String[] str1 = s.split("(0+)");
        Arrays.sort(str1, (a, b) -> b.length() - a.length());

        String[] str0 = s.split("(1+)");
        Arrays.sort(str0, (a, b) -> b.length() - a.length());

        if (!s.contains("0")) {
            return true;
        }

        if (!s.contains("1")) {
            return false;
        }

        int oneL = Arrays.stream(s.split("(0+)"))
                .sorted((a, b) -> b.length() - a.length()).toList().get(0).length();

        int zeroL = Arrays.stream(s.split("(1+)"))
                .sorted((a, b) -> b.length() - a.length()).toList().get(0).length();

        return oneL > zeroL;
    }

    public static void main(String[] args) {

        LongerContiguousSegmentsOfOnesThanZeros longs = new LongerContiguousSegmentsOfOnesThanZeros();

        String s = "110100010";

        longs.checkZeroOnes(s);


    }
}

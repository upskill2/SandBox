package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {

        Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(s.substring(0, s.length() / 2));
        Matcher m1 = p.matcher(s.substring(s.length() / 2));

        int countHalf = 0;

        while (m.find()) {
            countHalf++;
        }

        while (m1.find()) {
            countHalf--;

        }

        return countHalf==0;
    }

    public static void main(String[] args) {
        DetermineIfStringHalvesAreAlike hal = new DetermineIfStringHalvesAreAlike();

        String s = "book";
        String s1 = "MerryChristmas";


  //      hal.halvesAreAlike(s);
        hal.halvesAreAlike(s1);
    }

}

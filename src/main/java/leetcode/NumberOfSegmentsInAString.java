package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfSegmentsInAString {

    public int countSegments(String s) {

        List<String> sList2 = new ArrayList<>();

        Pattern p = Pattern.compile("\\S*\\S");
        Matcher m = p.matcher(s);

        while(m.find()){
            sList2.add(m.group());
        }

       return s.isEmpty() ? 0 : sList2.size();

    }

    public static void main(String[] args) {

        NumberOfSegmentsInAString ns = new NumberOfSegmentsInAString();
        String s = ", , , ,        a, eaefa";
        String s1 = "Hello, my name is John";
        String s2 = "Hello";

        ns.countSegments(s);
        ns.countSegments(s1);
        ns.countSegments(s2);

    }

}

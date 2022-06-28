package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakeTheStringGreat {

    public String makeGood(String s) {


        //      String newStr =  s.replaceAll("([a-z])([A-Z])|([A-Z])([a-z])","");

        String res = s;
        String strFinal = removeLetters(s);

        while (!strFinal.equals(res)) {
            res = strFinal;
            strFinal = removeLetters(strFinal);

        }

        return strFinal;
    }

    private String removeLetters(String s1) {

        StringBuilder res = new StringBuilder();
        res.append(s1);

        for (int i = 1; i < res.length(); i++) {
            if (Character.toLowerCase(res.charAt(i - 1)) == Character.toLowerCase(res.charAt(i))) {
                if (res.charAt(i - 1) != res.charAt(i)) {

                    res.replace(i - 1, i + 1, "");

                }
            }
        }


        return res.toString();
    }

    public static void main(String[] args) {

        MakeTheStringGreat mk = new MakeTheStringGreat();

        String s = "leEeetcode";
        String s1 = "abBAcC";
        String s2 = "s";

   //         mk.makeGood(s);
  //      mk.makeGood(s1);
        mk.makeGood(s2);
    }
}

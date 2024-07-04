package leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckIfStringIsAPrefixOfArray {

    public boolean isPrefixString(String s, String[] words) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
           ;
            sb.append(words[i]);
          String s1 =  sb.toString();
            if (sb.toString().equals(s)) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        CheckIfStringIsAPrefixOfArray ar = new CheckIfStringIsAPrefixOfArray();

        String s = "iloveleetcode", words[] = {"i", "love", "leetcode", "apples"};

        System.out.println(ar.isPrefixString(s, words));
    }

}

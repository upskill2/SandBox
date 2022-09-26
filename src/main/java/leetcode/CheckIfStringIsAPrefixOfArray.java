package leetcode;

import java.util.Arrays;

public class CheckIfStringIsAPrefixOfArray {

    public boolean isPrefixString(String s, String[] words) {

        StringBuilder sb = new StringBuilder(Arrays.stream(words).toString());

        return true;

    }

    public static void main(String[] args) {
        CheckIfStringIsAPrefixOfArray ar = new CheckIfStringIsAPrefixOfArray();

        String s = "iloveleetcode", words[] = {"i", "love", "leetcode", "apples"};

        ar.isPrefixString(s,words);
    }

}

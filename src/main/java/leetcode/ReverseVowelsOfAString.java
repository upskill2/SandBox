package leetcode;

import java.util.*;

public class ReverseVowelsOfAString {


    public String reverseVowels(String s) {  // h e l l o


        List<String> list = Arrays.asList(s.split(""));
        String vowels = "aeiuoAEIUO";

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            while (vowels.indexOf(list.get(left)) < 0 && left < right) {
                left++;
            }

            while (vowels.indexOf(list.get(right)) < 0 && left < right) {
                right--;
            }
            swapVowels(list, left, right);
            left++;
            right--;
        }


        return String.join("", list);
    }

    static void swapVowels(List<String> list, int left, int right) {
        String temp = "";
        temp = list.get(left);
        list.set(left, list.get(right));
        list.set(right, temp);

    }


    public static void main(String[] args) {

        String s = "hello";
        String s1 = "leetcode";
        ReverseVowelsOfAString vowel = new ReverseVowelsOfAString();

        System.out.println(vowel.reverseVowels(s));
        System.out.println(vowel.reverseVowels(s1));


    }

}

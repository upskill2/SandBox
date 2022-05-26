package leetcode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {

        Stack<Character> uniques = new Stack<>();

        uniques.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!uniques.isEmpty() && uniques.peek() == s.charAt(i)) {
                uniques.pop();
            } else {
                uniques.push(s.charAt(i));
            }
        }

        String res = uniques.toString();
        res = res.replaceAll("[^a-z]","");

        return res;

    }

    private String remDp(String str) {

        StringBuilder sb = new StringBuilder(str);
        boolean hasDupe = true;

        while (hasDupe) {
            hasDupe=false;
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.replace(i,i+2,"");
      //             sb.delete(i, i + 2);
                    hasDupe = true;
                }
            }
        }



        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "abbaca";
        String s1 = "azxxzy";
        String s2 = "aaaaaaaaa";

        RemoveAllAdjacentDuplicatesInString rd = new RemoveAllAdjacentDuplicatesInString();
           rd.removeDuplicates(s);
           rd.removeDuplicates(s1);
        rd.removeDuplicates(s2);
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c : S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }

    public static void main(String[] args) {

        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        String s = "ab#c", t = "ad#c";
        String s1 = "ab##", t1 = "c#d#";
        backspaceStringCompare.backspaceCompare(s, t);
        backspaceStringCompare.backspaceCompare(s1, t1);
    }

}


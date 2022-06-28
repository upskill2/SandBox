package leetcode.resources;

import leetcode.MakeTheStringGreat;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if(!stack.isEmpty() && Character.isUpperCase(c) &&
                    Character.toLowerCase(c) == stack.peek()
                    || !stack.isEmpty() && Character.isUpperCase(stack.peek()) &&
                    c == Character.toLowerCase(stack.peek())) {

                stack.pop();

            }
            else
                stack.push(c);
        }

        String str = "";
        while(!stack.isEmpty())
            str = stack.pop() + str;

        return str;
    }


    public static void main(String[] args) {
        Solution mk = new Solution();

        String s = "leEeetcode";
        String s1 = "abBAcC";
        String s2 = "s";

                mk.makeGood(s);
        //      mk.makeGood(s1);
      //  mk.makeGood(s2);
    }
}
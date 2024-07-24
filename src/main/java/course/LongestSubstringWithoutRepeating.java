package course;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public int longestSubstringWithoutRepeating(String str) {
        Queue<Character> q = new LinkedList<>();

        int res = Integer.MIN_VALUE;
        for (char ch : str.toCharArray()) {
            if (q.contains(ch)) {
                res = Math.max(res, q.size());
                while (!q.isEmpty()) {
                    char temp = q.poll();
                    if (temp == ch) {
                        q.add(ch);
                        break;
                    }
                }
            } else {
                q.add(ch);
            }
        }
        return Math.max(res, q.size());
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating l = new LongestSubstringWithoutRepeating();
        System.out.println(l.longestSubstringWithoutRepeating("abcdef"));
    //    System.out.println(l.longestSubstringWithoutRepeating("eddy"));

    }
}

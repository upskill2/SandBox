package course;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class FirstRepeatingCharacter {

    public char firstRepeatingCharacter(String str) {
        char[] s = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : s) {
            if (set.contains(ch)) {
                return (char) ch;
            } else {
                set.add(ch);
            }
        }
        return '\0';

    }

    public static void main(String[] args) {
        FirstRepeatingCharacter f = new FirstRepeatingCharacter();
        System.out.println( f.firstRepeatingCharacter("aa"));
    }
}

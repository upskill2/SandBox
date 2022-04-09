package leetcode;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {

        int indexStart = 0;
        for (int i = s.length - 1; i >= s.length / 2; i--) { //'h', 'e', 'l', 'l', 'o'
            char temp;
            temp = s[indexStart];
            s[indexStart] = s[i];
            s[i] = temp;
            indexStart++; //

        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] input = {'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a'};

        ReverseString rs = new ReverseString();
     //  rs.reverseString(s);
        rs.reverseString(input);
    }

}

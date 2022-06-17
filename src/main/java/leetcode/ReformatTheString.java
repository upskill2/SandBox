package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReformatTheString {

    public String reformat(String s) {

        List<String> numList = new ArrayList<>();
        List<Character> charList = new ArrayList<>();

        int numCount = 0;
        int charCount = 0;
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()
        ) {
            if (Character.isDigit(ch)) {
                numList.add(String.valueOf(ch));
                numCount++;
            } else {
                charList.add(ch);
                charCount++;
            }

        }

        if (Math.abs(numCount-charCount)>1) {
            res = new StringBuilder("");
        } else if (numCount - charCount ==-1) {
            while (res.length() < s.length()) {
                for (int i = 0; i < charList.size(); i++) {
                    if(i==charList.size()-1){
                        res.append(charList.get(i));
                    } else

                    res.append(charList.get(i)).append(numList.get(i));
                }
            }

        } else if (numCount - charCount == 1) {
            while (res.length() < s.length()) {
                for (int i = 0; i < numList.size(); i++) {
                    if(i==numList.size()-1){
                        res.append(numList.get(i));
                    }
                    else
                    res.append(numList.get(i)).append(charList.get(i));
                }
            }
        } else {
            res = new StringBuilder(s);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        ReformatTheString ref = new ReformatTheString();

        String s = "a0b1c2";
        String s1 = "leetcode";
        String s2 = "covid2019";
        String s3 = "a12bcd";

        //    ref.reformat(s);
      //  ref.reformat(s1);
    //    ref.reformat(s2);
        ref.reformat(s3);
    }

}

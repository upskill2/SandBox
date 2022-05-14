package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        int idxStart = 0;
        char temp = ' ';
        for (int i = list.size()-1; i > idxStart; i--) {
            if (Character.isLetter(list.get(i))) {
                 idxStart=idxOfChar(idxStart,list,i);
                    temp = list.get(i);
                    list.set(i,list.get(idxStart));
                    list.set(idxStart,temp);
                    idxStart++;
                                }
            }


        String res = list.stream()
                .map(ch->ch.toString())
                .collect(Collectors.joining());
        return res;
    }

    public static int idxOfChar(int idx, List<Character> list, int backwardsValue){
        if(Character.isLetter(list.get(idx))){
            return idx;
        } else {
            idx++;
            return idxOfChar(idx,list,backwardsValue);}
    }

    public static void main(String[] args) {

        String s = "Test1ng-Leet=code-Q!";
        new ReverseOnlyLetters().reverseOnlyLetters(s);
    }

}

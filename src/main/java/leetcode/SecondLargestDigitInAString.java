package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestDigitInAString {

    public int secondHighest(String s) {

        int res = -1;

        LinkedHashSet<Character> set = s.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        List<Integer> list = new ArrayList<>();
        for (Character el : set) {

            if (!Character.isDigit(el)) {
                if (list.size() > 1) {
                    res = list.get(list.size() - 2);
                }
                break;

            } else {
                list.add(Character.getNumericValue(el));
            }

        }

        //    int res1 = it.next();
//        if (Character.isDigit(res1)) {bol = true;}

//int res1 = Character.getNumericValue(it.next()) ;
/*        int res2 = it.next();
        int res3 = it.next();
        int res4 = it.next();
        int res5 = it.next();*/
        //    boolean b =  Character.isDigit(it.next());

        //       int r = Character.isDigit(res1) ? Character.getNumericValue(res1) : -1;
        //     return Character.isDigit(res1) ? Character.getNumericValue(res1) : -1;

        int test = list.size() > 1 ? list.get(list.size() - 2) : res;

        return  list.size() > 1 ? list.get(list.size() - 2) : res;
    }

/*    private int binarySearch(LinkedHashSet<Character> st) {
        int mid = st.size() / 2;

        if(st.){

        }
    }*/

    public static void main(String[] args) {
        SecondLargestDigitInAString sec = new SecondLargestDigitInAString();

        String s = "ck077";
        String s1 = "dfa12321afd";
        String s2 = "abc1111";
        String s3 = "1";
        String s4 = "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777772";

        sec.secondHighest(s);
        sec.secondHighest(s1);
        sec.secondHighest(s2);
         sec.secondHighest(s3);
        sec.secondHighest(s4);
    }
}

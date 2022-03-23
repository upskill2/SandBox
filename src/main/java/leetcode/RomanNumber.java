package leetcode;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RomanNumber {

    public int romanToInt(String s) {

        Map <String, Integer> roman_numbers_map = new HashMap<String,Integer>();
        roman_numbers_map.put("I",1);
        roman_numbers_map.put("V",5);
        roman_numbers_map.put("X",10);
        roman_numbers_map.put("L",50);
        roman_numbers_map.put("C",100);
        roman_numbers_map.put("D",500);
        roman_numbers_map.put("M",1000);

        StringBuilder str = new StringBuilder(s);

        int value = 0;

            for (int i = str.length()-1; i >= 0 ; i--) {
                if(i<str.length()-1 && roman_numbers_map.get(String.valueOf(str.charAt(i)))<roman_numbers_map.get(String.valueOf(str.charAt(i+1)))
                ){
                    value -= roman_numbers_map.get(String.valueOf(str.charAt(i)));
                } else value += roman_numbers_map.get(String.valueOf(str.charAt(i)));
            }
        return value;
    }
    public static void main(String[] args) {
        System.out.println(new RomanNumber().romanToInt("III"));
        System.out.println(new RomanNumber().romanToInt("IXX"));
        System.out.println(new RomanNumber().romanToInt("MCMXCIV"));
    }
}

package leetcode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOfDifferentIntegersInAString {
    public int numDifferentIntegers(String word) {


        String str1 = word.replaceAll("\\D"," ");
        String newSt = str1.replaceAll("\\s{2,}", " ").trim();

        Set<String> set4 = new HashSet<>();
        String[] array = word.split("([a-z]+)");
        for (String str : array) {
            if(!Objects.equals(str, "")){

                set4.add((str.replaceAll("^0+","")));
            }
        }
/*

        Matcher m = Pattern.compile("(?=\\d)").matcher(word);

        Set<String> set3 = new TreeSet<>();
        if(m.find()){
                set3.add(m.group(0));
        }

        Set<String> set1 = Stream.of(word.split("[a-z]+")).collect(Collectors.toSet());
 int res = set1.contains("") ? set1.size()-1 : set1.size();*/

        return set4.size();
    }

    public static void main(String[] args) {
        NumberOfDifferentIntegersInAString b = new NumberOfDifferentIntegersInAString();
        String word = "a123bc34d8ef34";
        String word1 = "125";
        String word2  = "leet1234code234";
        String word3  = "a1b01c001";
        String word4  = "167278959591294";

      b.numDifferentIntegers(word);
/*        b.numDifferentIntegers(word2);
        b.numDifferentIntegers(word3);
     b.numDifferentIntegers(word1);*/
   //  b.numDifferentIntegers(word4);

        b.numDifferentIntegers(word3);
    }

}

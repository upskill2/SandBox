package course;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringSubsequences {

    public ArrayList<String> getSubsequences_1(String str) {

        String e = "";
        Set<String> output = new HashSet<>();
        output.add("");
        for (int i = 0; i < str.length(); i++) {
            e = String.valueOf(str.charAt(i));
            output.add(e);
            for (int j = i + 1; j < str.length(); j++) {
                final String b = str.substring(i + 1, j + 1);
                final String acd = str.substring(j + 1, str.length());
                final String abd = str.substring(0, j);
                String e2 = e + b;
                String e3 = e + acd;
                String e4 = abd + acd;
                String e5 = e + str.charAt(j);

                output.add(e3);
                output.add(e2);
                output.add(e4);
                output.add(e5);
            }
        }
        return new ArrayList<>(output);
    }

    static void getSubsequences(String str, int i, String subsequence, ArrayList<String> array){
        if(i == str.length()){
            array.add(subsequence);
        }else{
            getSubsequences(str, i+1, subsequence+str.charAt(i), array);
            getSubsequences(str, i+1, subsequence, array);
        }
    }

    static ArrayList<String> getSubsequences(String str){
        ArrayList<String> subsequences = new ArrayList<>();
        getSubsequences(str, 0, "", subsequences);
        return subsequences;
    }

    public static void main(String[] args) {
        StringSubsequences s = new StringSubsequences();
        s.getSubsequences("abcd");
    }
}

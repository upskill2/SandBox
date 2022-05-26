package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {

        //  Pattern p = Pattern.compile("(?<=a good )\\w+");


        Pattern p = Pattern.compile(String.format("(?<=\s" + first + "\s" + second + "\s)\\w+"));
        Matcher m = p.matcher(" " + text);

        List<String> res = new ArrayList<>();
        while (m.find()) {
            res.add(m.group());
        }


        return res.toArray(String[]::new);
    }


    public static void main(String[] args) {

        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        String text1 = "we will we will rock you", first1 = "we", second1 = "will";
        String text2 = "alice is aaa good girl she is a good student", first2 = "a", second2 = "good";


        OccurrencesAfterBigram ocuur = new OccurrencesAfterBigram();

        ocuur.findOcurrences(text, first, second);
        ocuur.findOcurrences(text1, first1, second1);
        ocuur.findOcurrences(text2, first2, second2);

    }
}

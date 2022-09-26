package leetcode;

import java.util.StringTokenizer;

public class MaximumNumberOfWordsYouCanType {

    public int canBeTypedWords(String text, String brokenLetters) {


        StringTokenizer tokens = new StringTokenizer(text, " ");

        String[] spl = text.split("\\s");
        String[] splBroken = brokenLetters.split("");

        if(brokenLetters.length()==0){
            return spl.length;
        }

        int res = 0;
        for (String s : spl) {
            for (int i = 0; i < splBroken.length; i++) {
                if (s.contains(splBroken[i])){
                    res++;
                    break;
                }
            }

        }
        return spl.length-res;
    }

    public static void main(String[] args) {
        MaximumNumberOfWordsYouCanType type = new MaximumNumberOfWordsYouCanType();

        String text = "hello world", brokenLetters = "ad";

        type.canBeTypedWords(text, brokenLetters);
    }

}

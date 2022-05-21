package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SentenceSimilarity {

    public boolean similarity(String[] sentence1, String[] sentence2, String[][] similarPairs) {


    if(sentence1.length!= sentence2.length) {return false;}

    Comparator<String> myComp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
         return  o1.compareTo(o2);
        }
    };

    Arrays.equals(sentence1,sentence2);

   return  Arrays.equals(sentence1,sentence2) || wordsInSentence(sentence1,similarPairs) && wordsInSentence(sentence2,similarPairs);

    }

    private boolean wordsInSentence(String[] sentence, String[][] pairs){

        int trueCount = 0;
        int len = 0;

        while(len < sentence.length){

            for (int i = 0; i < pairs.length; i++) {
                for (int j = 0; j < pairs[0].length; j++) {
                        if(sentence[len].equals(pairs[i][j])){
                            trueCount++;
                        }
                }
            }
            len++;
        }

        return sentence.length==trueCount ;

    }

    public static void main(String[] args) {

        SentenceSimilarity sm = new SentenceSimilarity();

        String[] sentence1 = {"great", "acting", "skills"};
        String[] sentence2 = {"fine", "drama", "talent"};
        String[][] similarPairs = {{"great", "fine"}, {"drama", "acting"}, {"skills", "talent"}};

        sm.similarity(sentence1, sentence2, similarPairs);


    }
}

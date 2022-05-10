package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        String par = paragraph.toLowerCase();

        List<String> list = new ArrayList<>();
        for (String word : par.split("\\W+")
        )    {
            list.add(word);
        }
        for (String s : banned
        ) {
            list.removeAll(Collections.singleton(s));
        }
        Collections.sort(list);

        if(list.size()==1){return list.get(0);}

        int maxCount = 0;
        int tempMaxCount = 1;
        String tempRes = "";
        String result = "";
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1)) ) {
                tempMaxCount++;
                tempRes = list.get(i);
                if (tempMaxCount > maxCount
                ) {maxCount=tempMaxCount;
                result=tempRes;
                }
            } else tempMaxCount = 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        String paragraph1 = "a, a, a, a, b,b,b,c, c";
        String[] banned1 = {"a"};

        new MostCommonWord().mostCommonWord(paragraph, banned);
        new MostCommonWord().mostCommonWord(paragraph1, banned1);

    }

}

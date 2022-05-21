package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class FindCommonCharacters {


    public List<String> commonChars(String[] words) {
      List<Character> res = words[0].chars()
                .mapToObj(ch -> (char) ch).sorted(Comparator.naturalOrder()).collect(Collectors.toList());


        for (int i = 1; i < words.length; i++) {

            List<Character> listTemp = words[i]
                    .chars()
                    .mapToObj(ch -> (char) ch)
                    .collect(Collectors.toList());

            for (int j = 0; j < res.size(); j++) {
                if (listTemp.contains(res.get(j))) {
                    listTemp.remove(res.get(j));
                } else {
                    res.set(j,'0');
                }
            }

        }

       List<String> output = new ArrayList<>();
        for (char ch : res
        ) {
            if(ch!='0'){
                output.add(String.valueOf(ch));
            }
        }

        return output;

    }

    public static void main(String[] args) {

        String[] words = {"bella", "label", "roller"};
        String[] words1 = {"cool", "lock", "cook"};
        String[] words2 = {"ook", "oooo"};

        FindCommonCharacters df = new FindCommonCharacters();
             df.commonChars(words);
            df.commonChars(words1);
      //  df.commonChars(words2);
    }

}

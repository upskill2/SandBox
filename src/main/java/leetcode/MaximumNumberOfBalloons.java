package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {

    private final String bal = "balloon";

    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> mapBaloon = new HashMap<>();

        for (char ch : bal.toCharArray()
        ) {
            mapBaloon.put(ch, mapBaloon.getOrDefault(ch, 0) + 1);

        }

        int validResult = 0;
        int res = Integer.MAX_VALUE;

        char[] strArr;
        while (text.length() > 0) {

            strArr = text.toCharArray();
            char ch = strArr[0];

            int count = 1;
            for (int i = 1; i < strArr.length; i++) {
                if (ch == strArr[i]) {
                    count++;
                }
            }

            if(mapBaloon.containsKey(ch)){

                res = Math.min(count / mapBaloon.get(ch), res);
                validResult++;
            }
             text = text.replace("" + ch, "");
        }


        return validResult==5 ? res : 0;
    }

    public static void main(String[] args) {
        MaximumNumberOfBalloons maxi = new MaximumNumberOfBalloons();

        String text = "loonbalxballpoon";
        String text1 = "nlaebolko";
        String text2 = "leetcode";
        String text3 = "lloo";


        maxi.maxNumberOfBalloons(text);
        maxi.maxNumberOfBalloons(text1);
        maxi.maxNumberOfBalloons(text2);
        maxi.maxNumberOfBalloons(text3);
    }
}

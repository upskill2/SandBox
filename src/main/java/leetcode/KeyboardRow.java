package leetcode;

import java.util.*;

public class KeyboardRow {

    public String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";

        String joinStr = str1 + str2 + str3;

        Map<String, Integer> map = new HashMap<>();

        int idx = 0;
        int key = 1;
        while (idx < joinStr.length()) {
            switch (joinStr.charAt(idx)) {
                case 'a':
                    key++;
                    break;
                case 'z':
                    key++;
            }
            map.put(String.valueOf(joinStr.charAt(idx)), key);
            idx++;
        }

        Set<String> tempSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words[i].length(); j++) {
                String sTr1 = String.valueOf(words[i].charAt(j));
                String sTr0 = String.valueOf(words[i].charAt(j - 1));
                if(!map.get(sTr1.toLowerCase()).equals(map.get(sTr0.toLowerCase()))){
                    tempSet.add(words[i]);
                }
           }
        }

    List<String> finalList = new ArrayList(Arrays.asList(words));

        finalList.removeAll(tempSet);

        String [] str = new String[finalList.size()];


        if(str.length==0){
            return str;
        } else for (int i = 0; i < str.length; i++) {
            str[i]= finalList.get(i);
        }



        return str;
    }

    public static void main(String[] args) {
        KeyboardRow kb = new KeyboardRow();
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] words1 = new String[]{"omk"};
        String[] words2 = new String[]{"zZxcvbnm"};
        String[] words3 = new String[]{"Aasdfghjkl","Qwertyuiop","zZxcvbnm"};

        // kb.findWords(words);
        // kb.findWords(words1);
        kb.findWords(words2);
    }

}

package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        Map<Character, Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);
            hashMap.put(letter, hashMap.getOrDefault(letter,0)+1);
        }

        char ch = ' ';
        int result = 0;

        for (Map.Entry<Character, Integer> set : hashMap.entrySet()){
            if(set.getValue()==1){
                ch = set.getKey();
                result =  s.indexOf(ch,0);
                break;

            } else result= -1;
        }
        return result;
    }


    public static void main(String[] args) {
        FirstUniqueCharacterInAString firts = new FirstUniqueCharacterInAString();
        String s = "loveleetcode";
        String s1 = "leetcode";
        String s2 = "aabb";

      //  System.out.println(firts.firstUniqChar(s));
     //   System.out.println(firts.firstUniqChar(s1));
        System.out.println(firts.firstUniqChar(s2));

    }

}

package leetcode;

import java.util.*;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        int index = 0;

        List<String> list = new ArrayList<>();
                list.addAll(Arrays.asList(magazine.split(""))); //


        for (int i = 0; i < ransomNote.length(); i++) {
            if (list.contains(String.valueOf(ransomNote.charAt(i)))) {
               index =  list.indexOf(String.valueOf(ransomNote.charAt(i)));
                list.remove(index);
            } else return false;
        }


        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();

        String ransomNote = "aab";
        String magazine = "baa";

        rn.canConstruct(ransomNote, magazine);
    }

}

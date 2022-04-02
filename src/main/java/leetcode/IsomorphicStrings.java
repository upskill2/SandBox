package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hashS = new HashMap();
        HashMap<Character, Character> hashT = new HashMap();


        for (int i = 0; i < s.length(); i++) { //egg /add
            char sh = s.charAt(i);
            char th = t.charAt(i);
            if (hashS.containsKey(sh) && hashS.get(sh)!= th) {
                return false;
            }
            hashS.put(sh, th);
        }

        for (int i = 0; i < t.length(); i++) { //egg /add
            char th = t.charAt(i);
            char sh = s.charAt(i);
            if (hashT.containsKey(th) && hashT.get(th)!= sh) {
                return false;
            }
            hashT.put(th, sh);
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "papap";
        String t = "titii";
        IsomorphicStrings iso = new IsomorphicStrings();


        System.out.println(iso.isIsomorphic(s, t));

    }

}

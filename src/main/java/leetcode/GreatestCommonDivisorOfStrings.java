package leetcode;

public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        String res = "";
        int len = Math.min(str1.length(), str2.length());

        while (len > 0) {

            if (str1.length() % len == 0 && str2.length() % len == 0) {

                if (str1.substring(0, len).equals(str2.substring(0, len))) {
                    String[] s1 = str1.split(str1.substring(0, len));
                    String[] s2 = str2.split(str1.substring(0, len));

                    if (s1.length == 0 && s2.length == 0) {
                        res = str1.substring(0, len);
                        break;
                    }
                }
            }

            len--;
        }


        return res;
    }


    public static void main(String[] args) {

        String str1 = "ABCABC", str2 = "ABC";
        String str3 = "ABABAB", str4 = "ABAB";
        String str5 = "LEET", str6 = "CODE";
        String str7 = "ABCDEF", str8 = "ABC";


        GreatestCommonDivisorOfStrings gk = new GreatestCommonDivisorOfStrings();
             gk.gcdOfStrings(str1, str2);
             gk.gcdOfStrings(str3, str4);
              gk.gcdOfStrings(str5, str6);
        gk.gcdOfStrings(str7, str8);

    }

}

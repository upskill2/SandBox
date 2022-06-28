package leetcode;

public class ReplaceAllsToAvoidConsecutiveRepeatingCharacters {
    public String modifyString(String s) {


        if(s.length()==1 && s.charAt(0)=='?'){
            return "a";
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (sb.charAt(i) == '?') {
                if (i == 0) {
                    sb.setCharAt(i, returnChar(sb.charAt(1)));
                }
                else if (i == sb.length() - 1) {
                    sb.setCharAt(i, returnChar(sb.charAt(sb.length() - 2)));
                } else {
                    sb.setCharAt(i, returnChar(sb.charAt(i - 1), sb.charAt(i + 1)));
                }
            }

        }

        return sb.toString();
    }

    private char returnChar(char prev, char next) {
        char res = ' ';
        if (prev == 'a') {
            if (next != 'b') {
                res = 'b';
            } else{
                res ='c';
            }
        } else {
            if(next!='b'){ //b?c
                if(prev!='b'){
                    res='b';
                } else{
                    if(next=='c'){
                        res = 'a';
                    } else {
                        res='c';
                    }

                }

            } else{
                res = 'a';
            }
        }

        return res;
    }

    private char returnChar(char prev) {

        return prev == 'a' ? 'b' : 'a';
    }

    public static void main(String[] args) {
        ReplaceAllsToAvoidConsecutiveRepeatingCharacters all = new ReplaceAllsToAvoidConsecutiveRepeatingCharacters();

        String s = "?j?qg??b?";
        String s1 = "??";
        String s2 = "b?a";
        String s3 = "b?c";

  //      all.modifyString(s);
 //       all.modifyString(s1);
        all.modifyString(s2);
        all.modifyString(s3);
    }

}

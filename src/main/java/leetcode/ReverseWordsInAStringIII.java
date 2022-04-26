package leetcode;

public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {

        int start = 0;
        int end = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                end = i;
                sb.append(new StringBuilder(s.substring(start, end)).reverse());
             sb.append(" ");  //s'teL ekat  edoCteeL
                start = end+1;
            } else if (i == s.length() - 1){
                end = i+1;
                sb.append(new StringBuilder(s.substring(start, end)).reverse());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";


        new ReverseWordsInAStringIII().reverseWords(s);

    }

}

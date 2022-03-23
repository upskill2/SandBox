package leetcode;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        StringBuffer myString = new StringBuffer(s);
        int result = 0;
        int finalResult = 0;

        for (int i = 0; i < myString.length(); i++) {

            for (int j = i+1; j < myString.length(); j++) {

                if(myString.charAt(i)==myString.charAt(j)){
                    result = j-i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("abcabcbb"));
    }

}

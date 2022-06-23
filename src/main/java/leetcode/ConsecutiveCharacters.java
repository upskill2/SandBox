package leetcode;

public class ConsecutiveCharacters {
    public int maxPower(String s) {

        int count = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                } else {
                max=Math.max(max,count);
                count=1;
            }
        }

        return Math.max(max,count);
    }

    public static void main(String[] args) {
        ConsecutiveCharacters cons = new ConsecutiveCharacters();

        String s = "leetcode";
        String s1 = "abbcccddddeeeeedcba";
        String s2 = "cc";

       //cons.maxPower(s);
       // cons.maxPower(s1);
       cons.maxPower(s2);

    }
}

package leetcode;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {

        int targetLen = num.length();

        for (int i = num.length() - 1; i > -1; i--) {


            if ((int) num.charAt(i) % 2 == 0) {
                targetLen--;
            } else {
                break;
            }
        }


        return targetLen > 0 ? num.substring(0, targetLen) : "";
    }

    public static void main(String[] args) {
        LargestOddNumberInString lar = new LargestOddNumberInString();

        String num = "52";
        String num1 = "4206";
        String num2 = "35427";

        lar.largestOddNumber(num);
        lar.largestOddNumber(num1);
        lar.largestOddNumber(num2);
    }
}

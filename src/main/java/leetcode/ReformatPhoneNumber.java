package leetcode;

import java.util.Arrays;

public class ReformatPhoneNumber {

    public String reformatNumber(String number) {

        StringBuilder sb = new StringBuilder();

        String s = number.replace("-", "").replace(" ", "");
        String[] str = s.split("(?<=\\G.{3})");

        int len = str.length;
        int lastN = s.length() % 3;

        if (lastN == 1) {
            for (int i = 0; i < len; i++) {
                if (i < len - 2) {
                    sb.append(str[i]).append("-");
                } else if (i == len - 2) {
                    sb.append(str[i], 0, 2).append("-");
                } else {
                    sb.append(str[i - 1].charAt(2)).append(str[i]).append("-");
                }
            }
        } else {
            for (String ss : str) {
                sb.append(ss).append("-");
            }
        }

        //number.replaceAll("\\D", "").replaceAll("...?(?=..)", "$0-");

        return sb.deleteCharAt(sb.lastIndexOf("-")).toString();
    }

    public static void main(String[] args) {
        ReformatPhoneNumber re = new ReformatPhoneNumber();

        String number = "1-23-45 6";
        String number1 = "1-23-45";
        String number2 = "123 4-567";

        //    re.reformatNumber(number);
        //    re.reformatNumber(number1);
        re.reformatNumber(number2);
    }
}

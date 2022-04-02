package leetcode;

import java.util.ArrayList;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();
        int initialNumber = columnNumber;
        long tempInt = 0;
        long reminder = columnNumber;
        long tempIndex = columnNumber;

        ArrayList<Integer> al = new ArrayList();

        while (reminder > 0) {

            if ((reminder - (columnNumber / 26) * 26) == 0) {
                tempInt = 26;  //step 1
            } else tempInt = reminder - (columnNumber / 26) * 26;

            if ((tempInt * 26 + tempInt) <= initialNumber) {
                tempIndex = tempInt * 26 + tempInt;   //step 2 == index
            } else tempIndex = 0;

            al.add((int) tempInt);
            columnNumber /= 26;

                reminder /= 26;

        }

        for (int a : al
        ) {
            sb.append((char) (a + 64));
        }

        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();

        int convertToTitle = 1;
        int convertToTitle0 = 28; // 0-27=A //27*27=729=AA
        int convertToTitle1 = 701;
        int convertToTitle2 = 2147483647;

        System.out.println(e.convertToTitle(convertToTitle));
        System.out.println(e.convertToTitle(convertToTitle0));
        System.out.println(e.convertToTitle(convertToTitle1));
        System.out.println(e.convertToTitle(convertToTitle2));

    }

}

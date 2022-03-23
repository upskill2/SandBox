package leetcode;

public class ExcelSheetColumnTitle {

    public String convertToTitle(int columnNumber) {

       String str = "";

       char temp = ' ';

        for (int i = 0; i < columnNumber+1; i+=25) {
            temp= (char) (columnNumber + 64);
        }

        System.out.println(temp);

    return str;

    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();

        int convertToTitle = 1;
        int convertToTitle0 = 28; // 0-27=A //27*27=729=AA
        int convertToTitle1 = 701;

        System.out.println(e.convertToTitle(convertToTitle));
        System.out.println(e.convertToTitle(convertToTitle0));
        System.out.println(e.convertToTitle(convertToTitle1));

    }

}

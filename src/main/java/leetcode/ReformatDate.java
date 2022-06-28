package leetcode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ReformatDate {

    public String reformatDate(String date) {

        //String dateNew =  date.replaceAll("th|rd|nd","");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMM yyyy");

        LocalDate date1 = null;

        if(Character.isDigit(date.charAt(1))){
            date1 = LocalDate.parse(date.replaceAll("th|rd|nd|st",""),formatter);

        } else {
            date1 = LocalDate.parse(date.replaceAll("th|rd|nd|st",""),formatter1);
        }



        return date1.toString();
    }

    public static void main(String[] args) {
        ReformatDate ref = new ReformatDate();

        String date = "20th Oct 2052";
        String date1 = "6th Jun 1933";
        String date2 = "20nd Oct 2052";

       ref.reformatDate(date);
        ref.reformatDate(date1);
     //   ref.reformatDate(date2);
    }
}

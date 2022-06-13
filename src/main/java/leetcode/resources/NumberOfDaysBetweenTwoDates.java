package leetcode.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NumberOfDaysBetweenTwoDates {

    public int daysBetweenDates(String date1, String date2) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dddd");

        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);

        Date firstDate = new Date();
        Date secondDate = new Date();

        try {
            firstDate = format.parse(date1);
            secondDate = format.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        long diff =Math.abs(secondDate.getTime() - firstDate.getTime()) ;
        int res = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        return res;
    }

    public static void main(String[] args) {
        NumberOfDaysBetweenTwoDates number = new NumberOfDaysBetweenTwoDates();
        String date1 = "2019-06-29", date2 = "2019-06-30";
        String date3 = "2020-01-15", date4 = "2019-12-31";

        number.daysBetweenDates(date1, date2);
        number.daysBetweenDates(date4, date3);
    }

}

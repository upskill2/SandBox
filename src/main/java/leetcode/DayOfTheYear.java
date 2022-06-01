package leetcode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DayOfTheYear {

    public int dayOfYear(String date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        int yearMinus1 = Integer.parseInt(date.substring(0, 4)) - 1;
        long diff =0;

        try{
            Date firstDate = sdf.parse(yearMinus1 + "-12-31");
            Date secondDate = sdf.parse(date);
            long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
            diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        }
        catch (ParseException e){
                e.printStackTrace();
        }

        return (int) diff;
    }


    private boolean isALeapYear(String s) {

        int year = Integer.parseInt(s);
        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws ParseException {
        DayOfTheYear day = new DayOfTheYear();

        String date = "2019-01-09";

        day.dayOfYear(date);

    }

}

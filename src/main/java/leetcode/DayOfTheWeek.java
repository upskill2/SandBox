package leetcode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DayOfTheWeek {


    public String dayOfTheWeek(int day, int month, int year) {


        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String monthStr = String.valueOf(month).length() == 1 ? "0" + String.valueOf(month) : String.valueOf(month);

        Date date = new Date();

        try {
            date = format.parse(String.valueOf(year)
                    + monthStr
                    + String.valueOf(day));

        } catch (ParseException e) {
            e.printStackTrace();

        }


        String answer = LocalDate.of(year, month, day).getDayOfWeek().toString();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day1 = cal.get(Calendar.DAY_OF_WEEK);

        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String day2 = formatter.format(date);


        return day2;
    }

    public static void main(String[] args) throws ParseException {

        DayOfTheWeek dayClass = new DayOfTheWeek();

        int day = 31, month = 8, year = 2019;
        int day1 = 18, month1 = 7, year1 = 1999;

        dayClass.dayOfTheWeek(day, month, year);
        dayClass.dayOfTheWeek(day1, month1, year1);

    }
}

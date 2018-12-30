package com.stackroute.pe2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayCalculator {

    public static String[] calCalendar()
    {
        String[] strDates=new String[2];
        // Get calendar set to current date and time
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to monday of the current week
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);


        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        strDates[0]=df.format(calendar.getTime());
        for (int i = 0; i <6; i++) {
            calendar.add(Calendar.DATE, 1);
        }
        strDates[1]=df.format(calendar.getTime());
        return strDates;
    }

}

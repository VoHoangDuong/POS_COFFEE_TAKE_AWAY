package com.codegym.casestudy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String releaseDay = "2021-07-07";
        Date date1 = formatter.parse(releaseDay);
        String releaseDay2 = "2021-07-22";
        Date date2 = formatter.parse(releaseDay2);
        System.out.println(date2.getTime()-date1.getTime());
        long diff = TimeUnit.DAYS.convert(date2.getTime()-date1.getTime(),TimeUnit.MILLISECONDS);
        System.out.println(diff);
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date currentDate = new java.sql.Date(utilDate.getTime());
        System.out.println(currentDate);
    }

    private static int compareDate(java.sql.Date expDate) {
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date currentDate = new java.sql.Date(utilDate.getTime());
        return expDate.compareTo(currentDate);
    }
}

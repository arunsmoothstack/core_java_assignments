package com.ss.day5.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class MyBirthday {

    public void printBirthday () {
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        //DateTimeFormatter formatter = new DateTimeFormatter(dateFormat);
        try {
            date = dateFormat.parse("02-11-1996");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    public void previousThursday (LocalDate date) {
        System.out.println(date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)));
    }
    public static void main(String[] args) {
        MyBirthday myBirthday = new MyBirthday();
        myBirthday.printBirthday();
        myBirthday.previousThursday(LocalDate.now());
    }
}

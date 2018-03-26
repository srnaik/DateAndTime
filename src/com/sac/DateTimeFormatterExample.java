package com.sac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterExample {


    public static void main(String[] args){
        LocalDate localDate = LocalDate.of(2020, Month.DECEMBER, 30);
        LocalTime localTime = LocalTime.of(12,12,12);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        DateTimeFormatterExample example = new DateTimeFormatterExample();
        example.displayISOFormatter(localDate,localTime,localDateTime);
        example.useLocalizedMethods(localDate,localTime,localDateTime);
        example.useFormatMethods(localDate,localTime,localDateTime);
        example.useCustomFormatter(localDateTime);
    }

    private void displayISOFormatter(LocalDate localDate,LocalTime localTime,LocalDateTime localDateTime){
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }

    private void useLocalizedMethods(LocalDate localDate,LocalTime localTime,LocalDateTime localDateTime){
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Date using SHORT format: "+ shortDate.format(localDate));
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Date/Time using SHORT format: "+ shortDateTime.format(localDateTime));
        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("Time using SHORT format: "+ shortTime.format(localTime));
    }

    private void useFormatMethods(LocalDate localDate,LocalTime localTime,LocalDateTime localDateTime){
          DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
          DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
          System.out.println("Date using format method: "+ localDate.format(shortDate));
          System.out.println("Date/Time using format method: "+ localDateTime.format(shortDate));
          System.out.println("Time using format method: "+ localTime.format(shortTime));
    }

    private void useCustomFormatter(LocalDateTime localDateTime){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm a");
        System.out.println("Date using custom format: " + localDateTime.format(dateTimeFormatter));

    }
}

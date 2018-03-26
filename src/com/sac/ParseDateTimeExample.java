package com.sac;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParseDateTimeExample {

    public static void main(String[] args){
        ParseDateTimeExample example = new ParseDateTimeExample();
        example.parseDateTime();
    }


    private void parseDateTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd, yyyy");
        LocalDate localDate = LocalDate.parse("06 02, 2020", formatter);
        LocalTime localTime = LocalTime.parse("11:22");
        System.out.println("LocalDate after parsing: "+ localDate.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy")));
        System.out.println("LocalTime after parsing: "+ localTime);
    }
}

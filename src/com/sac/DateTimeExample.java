package com.sac;

import java.time.*;

public class DateTimeExample {

    LocalDate localDate, localDate1;
    LocalTime localTime, localTime1;
    LocalDateTime localDateTime, localDateTime1;

    public static void main(String[] args){
        DateTimeExample dateTimeExample = new DateTimeExample();
        dateTimeExample.createDate();
        dateTimeExample.createTime();
        dateTimeExample.createDateTime();
        dateTimeExample.manipulateDate();
        dateTimeExample.manipulateTime();
        dateTimeExample.manipulateDateTime();
    }


    private void createDate(){
        localDate = LocalDate.now();
        System.out.println("Current Date:\t"+ localDate);

        localDate1 = LocalDate.of(2015, Month.APRIL,20);
        System.out.println("Custom Date:\t"+ localDate1);
    }

    private void createTime(){
        localTime = LocalTime.now();
        System.out.println("Current Time:\t"+ localTime);

        localTime1 = LocalTime.of(11,10,02,11);
        System.out.println("Custom Time:\t"+ localTime1);
    }

    private void createDateTime(){
        localDateTime = LocalDateTime.now();
        System.out.println("Current Date/Time:\t"+ localDateTime);

        localDateTime1 = LocalDateTime.of(localDate1,localTime1);
        System.out.println("Custom Date/Time:\t"+ localDateTime1);
    }

    private void manipulateDate(){
        System.out.println("************* Manipulating various Date object values *************");
        if (localDate == null)
            localDate = LocalDate.now();
        localDate = localDate.plusDays(2);
        System.out.println("Date Value after manipulating Days:\t" + localDate);
        localDate = localDate.plusWeeks(1);
        System.out.println("Date Value after manipulating Weeks:\t" + localDate);
        localDate = localDate.plusMonths(1);
        System.out.println("Date Value after manipulating Months:\t" + localDate);
        localDate = localDate.plusYears(2);
        System.out.println("Date Value after manipulating Years:\t" + localDate);
        System.out.println("************* Manipulating various Date object values *************");
    }

    private void manipulateTime(){
        System.out.println("************* Manipulating various Time object values *************");
        if (localTime == null)
            localTime = LocalTime.now();
        localTime = localTime.plusMinutes(10);
        System.out.println("Date Value after manipulating Minutes:\t" + localTime);
        localTime = localTime.plusHours(3);
        System.out.println("Date Value after manipulating Hours:\t" + localTime);
        localTime = localTime.plusSeconds(59);
        System.out.println("Date Value after manipulating Months:\t" + localTime);
        localTime = localTime.plusNanos(35);
        System.out.println("Date Value after manipulating Years:\t" + localTime);
        System.out.println("************* Manipulating various Time object values *************");
    }

    private void manipulateDateTime(){
        System.out.println("************* Manipulating various DateTime object values *************");
        if(localDate == null)
            localDate = LocalDate.now();
        if (localTime == null)
            localTime = LocalTime.now();
        if(localDateTime == null)
            localDateTime = LocalDateTime.of(localDate,localTime);
        localDateTime = localDateTime.minusDays(1);
        System.out.println("DateTime Value after manipulating Days:\t" + localDateTime);
        localDateTime = localDateTime.minusHours(5);
        System.out.println("DateTime Value after manipulating Hours:\t" + localDateTime);
        localDateTime = localDateTime.minusMinutes(10);
        System.out.println("DateTime Value after manipulating Minutes:\t" + localDateTime);
        localDateTime = localDateTime.minusHours(5).minusMinutes(2).minusSeconds(10);
        System.out.println("Manipulating DateTime object values via chaining" + localDateTime);
        System.out.println("************* Manipulating various DateTime object values *************");
    }
}

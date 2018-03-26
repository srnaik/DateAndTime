package com.sac;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodExample {


    public static void main(String[] args){
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2020, Month.DECEMBER,31);
        Period everyDay = Period.ofDays(1); //every Day
        Period everyWeek = Period.ofWeeks(1); //every week
        Period everyMonth = Period.ofMonths(1); //every month
        Period everyYear = Period.ofYears(1); //every year

        PeriodExample periodExample = new PeriodExample();
        periodExample.performAnimalEnrichment(startDate,endDate,everyDay);
        periodExample.performAnimalEnrichment(startDate,endDate,everyWeek);
        periodExample.performAnimalEnrichment(startDate,endDate,everyMonth);
        periodExample.performAnimalEnrichment(startDate,endDate,everyYear);
    }

    private void performAnimalEnrichment(LocalDate startDate, LocalDate endDate, Period period){
        LocalDate upTo = startDate;
        while (upTo.isBefore(endDate)){
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }
}

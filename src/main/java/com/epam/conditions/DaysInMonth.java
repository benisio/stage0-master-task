package com.epam.conditions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class DaysInMonth {

    public void printDays(int year, int month) {
        try {
            if (year <= 0) {
                System.out.println("invalid date");
            } else {
                LocalDate date = LocalDate.of(year, month, 1);
                System.out.println(date.lengthOfMonth());
            }
        } catch (DateTimeException e) {
            System.out.println("invalid date");
        }
    }
}

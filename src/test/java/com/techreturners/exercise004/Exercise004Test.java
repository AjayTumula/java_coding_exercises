package com.techreturners.exercise004;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    //  Additional Testcases
    @Test
    public void checkGetDateTimeWithDate() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2022, Month.NOVEMBER, 20));
        LocalDateTime expected = LocalDateTime.of(2054, Month.JULY, 29, 01, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWithDateAndTime() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2020, Month.OCTOBER, 13, 10, 34, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.JUNE, 21, 12, 20, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWithDateAndTimeWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2022, Month.NOVEMBER, 21, 18, 45, 40, 0));
        LocalDateTime expected = LocalDateTime.of(2054, Month.JULY, 30, 20, 32, 20);

        assertEquals(expected, ex004.getDateTime());
    }

}

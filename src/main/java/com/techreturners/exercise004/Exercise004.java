package com.techreturners.exercise004;

import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {

    static final long GIGASECOND = (long)Math.pow(10,9);
    private LocalDateTime dateTime;

    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime.plusSeconds(GIGASECOND);
    }
}

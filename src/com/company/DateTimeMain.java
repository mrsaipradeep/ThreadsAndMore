package com.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeMain {
    public static void main(String[] args) throws ParseException {
        System.out.println(getValidDateRange("2020-01-24"));
        System.out.println(getValidDateRange("2020-01-24T01:02"));
        System.out.println(getValidDateRange("2020-01-24T10:02:59"));
    }

    private static String getValidDateRange(String dateRange) {
        String isoDateRange = null;


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        if (dateRange.length() <= 10) {
            // ISO Date without offset 	'2011-12-03'
            LocalDate date = LocalDate.parse(dateRange, DateTimeFormatter.ISO_DATE);
            LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.of(0, 0));
            isoDateRange = formatter.format(dateTime);
        } else if (dateRange.length() < 25) {
            // ISO Local Date and Time 	'2011-12-03T10:15:30'
            LocalDateTime date = LocalDateTime.parse(dateRange, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            isoDateRange = formatter.format(date);
        } else {
            String message = "Invalid dateRange pattern [" + dateRange + "]";
            System.out.println(message);
        }

        System.out.println(isoDateRange);
        return isoDateRange;
    }
}

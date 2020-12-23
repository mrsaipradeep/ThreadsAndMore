package com.company;

import sun.util.calendar.ZoneInfo;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //System.out.println(calendar.getTimeZone());
        ZoneInfo.getAliasTable().entrySet().stream().forEach(stringStringEntry -> System.out.println(stringStringEntry.getKey() + " <<>> " + stringStringEntry.getValue()));
        calendar.setTimeZone(TimeZone.getTimeZone("America/Aruba"));
        //System.out.println(calendar.getTimeZone());
        System.out.println(calendar.getTime());
    }
}

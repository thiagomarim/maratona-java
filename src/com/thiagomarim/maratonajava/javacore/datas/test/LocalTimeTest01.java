package com.thiagomarim.maratonajava.javacore.datas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime local = LocalTime.of(23, 22, 33);
        LocalTime now = LocalTime.now();
        System.out.println(local);

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}

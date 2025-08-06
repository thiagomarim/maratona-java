package com.thiagomarim.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(12);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofYears(2);
        Period p3 = Period.ofMonths(6);
        Period p4 = Period.ofWeeks(2);
        Period p5 = Period.ofDays(22);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}

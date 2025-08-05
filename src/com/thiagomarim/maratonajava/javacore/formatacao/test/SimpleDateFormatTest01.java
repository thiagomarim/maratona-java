package com.thiagomarim.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        System.out.println(sdf.format(new Date()));
        try {

            System.out.println(sdf.parse("2025.08.05 d.C. at 19:27:53 BRT"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}

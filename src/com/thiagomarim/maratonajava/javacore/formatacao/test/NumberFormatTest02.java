package com.thiagomarim.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeEN = new Locale("en", "US");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeEN);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        NumberFormat nf2 = NumberFormat.getCurrencyInstance();

        double valor = 100_000_000.2130;

        System.out.println("Fora de um Array = " + nf2.format(valor));

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }

        String valorString = "$1,000.00";

        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

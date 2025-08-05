package com.thiagomarim.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeBR);
        nfa[2] = NumberFormat.getInstance(localeJP);
        nfa[3] = NumberFormat.getInstance(localeIT);

        NumberFormat nf2 = NumberFormat.getInstance();

        double valor = 100_000_000.2130;

        System.out.println("Fora de um Array = " + nf2.format(valor));

        for (NumberFormat nf : nfa) {
            System.out.println(nf.format(valor));
        }
    }
}

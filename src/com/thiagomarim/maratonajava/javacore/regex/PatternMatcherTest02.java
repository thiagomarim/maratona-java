package com.thiagomarim.maratonajava.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d todos os digitos
        // \D Tudo que não for digito
        // \s Espaços em branco \t \n \f \r
        // \S Todos os caracteres, excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        String regex = "\\d";
        String text = "aa2ddd24445j";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("texto: " + text);
        System.out.println("indice: 0123456789" );
        System.out.println("regex: " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + " ");
        }
    }
}

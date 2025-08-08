package com.thiagomarim.maratonajava.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d todos os digitos
        // \D Tudo que não for digito
        // \s Espaços em branco \t \n \f \r
        // \S Todos os caracteres, excluindo os brancos
        // \w = a-Z A-Z, digitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // = zero ou uma
        // zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // |
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0x 0xFFABC 0x10G 0x1";
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

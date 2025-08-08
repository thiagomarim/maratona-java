package com.thiagomarim.maratonajava.javacore.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-z-A-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.br, teste@gmail.com.br, sakura@gmail";
        System.out.println("Email Valido");
        System.out.println("#@!zoro@gmail.br".matches(regex));
        System.out.println(text.split(", ")[1].trim());
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

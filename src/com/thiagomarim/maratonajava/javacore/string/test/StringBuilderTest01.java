package com.thiagomarim.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Thiago Soares";
        nome.concat("Marim");
        nome.substring(0, 3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Thiago Marim");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}

package com.thiagomarim.maratonajava.javacore.string.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Retorna o character do index selecionado
        System.out.println(nome.length()); // Retorna o tamanho do array
        System.out.println(nome.replace("f", "l")); // Substitui um character por outro
        System.out.println(nome.toLowerCase()); // Retorna a string em lowercase
        System.out.println(nome.toUpperCase()); // Retorna a string em uppercase
        System.out.println(numeros.length()); // Retorna o tamanho do array
        System.out.println(numeros.substring(3, 4)); // Retorna o character de um index selecionado ao outro
        System.out.println(numeros.substring(3)); // Retorna o character de um index selecionado até o final
        System.out.println(nome.trim()); // Remove os espacos em brancos da string;

    }
}

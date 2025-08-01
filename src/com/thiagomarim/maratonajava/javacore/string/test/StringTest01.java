package com.thiagomarim.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Thiago"; // String constant pool
        String nome2 = "Thiago";
        nome = nome.concat(" Marim");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Thiago"); // 1 variável de referencia, 2 objetos do tipo string, 3 string no String constant pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}

package com.thiagomarim.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000000L;
        long numeroGrande = (long) 153.23;
        double salarioDouble = 1200;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Thiago";

        System.out.println("A minha idade é de " + idade);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println("Olá meu nome é " + nome);
    }
}

package com.thiagomarim.maratonajava.javacore.metodos.dominio;

public class Calculadora {
    public void somarDoisNumeros(int num1, int num2) {
        System.out.println("Somar dois Números");
        System.out.println(num1 + num2);
    }

    public void subtrairDoisNumeros(int num1, int num2) {
        System.out.println("Subtrair dois Números");
        System.out.println(num1 - num2);
    }

    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println("Multiplicar dois Números");
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        System.out.println("Dividir dois Números");
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
        }
        return num1 / num2;
    }
}

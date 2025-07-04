package com.thiagomarim.maratonajava.javacore.metodos.test;

import com.thiagomarim.maratonajava.javacore.metodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somarDoisNumeros(20, 24);
        calculadora.subtrairDoisNumeros(20, 10);
        calculadora.multiplicarDoisNumeros(10, 2);
        double resultadoDivisao = calculadora.dividirDoisNumeros(10, 0);
        System.out.println(resultadoDivisao);
    }
}

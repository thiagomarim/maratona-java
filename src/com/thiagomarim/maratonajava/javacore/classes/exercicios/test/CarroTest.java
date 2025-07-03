package com.thiagomarim.maratonajava.javacore.classes.exercicios.test;

import com.thiagomarim.maratonajava.javacore.classes.exercicios.dominio.Carro;

// Crie uma classe carro com os seguintes atributos:
// Nome
// Modelo
// Ano
// Em seguida, crie dois objetos distintos e imprima os seus valores

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "C190";
        carro.modelo = "Mercedes";
        carro.ano = 2024;

        carro1.nome = "F40";
        carro1.modelo = "Ferrari";
        carro1.ano = 2022;

        System.out.println("Carro");
        System.out.println("Nome: " + carro.nome);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);

        System.out.println("----------------------------");

        System.out.println("Carro 1");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);


    }
}

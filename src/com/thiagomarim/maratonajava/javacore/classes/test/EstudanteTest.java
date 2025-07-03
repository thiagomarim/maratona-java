package com.thiagomarim.maratonajava.javacore.classes.test;

import com.thiagomarim.maratonajava.javacore.classes.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Thiago";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}

package com.thiagomarim.maratonajava.javacore.metodos.test;

import com.thiagomarim.maratonajava.javacore.metodos.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Thiago";
        estudante.sexo = 'M';
        estudante.idade = 20;

        estudante.imprimir();
    }

}

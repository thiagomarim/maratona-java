package com.thiagomarim.maratonajava.javacore.classes.test;

import com.thiagomarim.maratonajava.javacore.classes.dominio.Estudante;
import com.thiagomarim.maratonajava.javacore.classes.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kleber";
        professor.idade = 36;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome);
        System.out.println("Idade: " + professor.idade);
        System.out.println("Sexo: " + professor.sexo);
    }
}

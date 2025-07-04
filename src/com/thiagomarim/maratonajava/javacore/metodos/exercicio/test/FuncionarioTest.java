package com.thiagomarim.maratonajava.javacore.metodos.exercicio.test;

import com.thiagomarim.maratonajava.javacore.metodos.exercicio.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Thiago";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1200, 2400.50, 1400};

        funcionario.imprimir();
    }
}

package com.thiagomarim.maratonajava.javacore.modificadoracesso.test;

import com.thiagomarim.maratonajava.javacore.modificadoracesso.dominio.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Thiago");
        pessoa.setIdade(20);

        pessoa.imprimir();
    }
}

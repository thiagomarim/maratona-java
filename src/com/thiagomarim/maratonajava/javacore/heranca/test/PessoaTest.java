package com.thiagomarim.maratonajava.javacore.heranca.test;

import com.thiagomarim.maratonajava.javacore.heranca.dominio.Endereco;
import com.thiagomarim.maratonajava.javacore.heranca.dominio.Funcionario;
import com.thiagomarim.maratonajava.javacore.heranca.dominio.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Vila Ede", "4444444");
        Pessoa pessoa = new Pessoa("Thiago", 20, "22222222", endereco);

        Funcionario funcionario = new Funcionario("Thiago", 20, "444444", endereco, 2400);

//        pessoa.imprimir();
        funcionario.imprimir();
    }
}

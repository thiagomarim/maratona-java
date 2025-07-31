package com.thiagomarim.maratonajava.javacore.excecao.exception.dominio;

public class Funcionario extends Pessoa {
    @Override
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvanod funcionário..");
    }
}

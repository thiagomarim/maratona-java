package com.thiagomarim.maratonajava.javacore.excecao.exception.test;

import com.thiagomarim.maratonajava.javacore.excecao.exception.dominio.Funcionario;
import com.thiagomarim.maratonajava.javacore.excecao.exception.dominio.LoginInvalidoException;
import com.thiagomarim.maratonajava.javacore.excecao.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}

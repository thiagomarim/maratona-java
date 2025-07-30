package com.thiagomarim.maratonajava.javacore.polimorfismo.servico;

import com.thiagomarim.maratonajava.javacore.polimorfismo.repositiorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados..");
    }
}

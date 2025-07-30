package com.thiagomarim.maratonajava.javacore.polimorfismo.servico;

import com.thiagomarim.maratonajava.javacore.polimorfismo.repositiorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória...");
    }
}

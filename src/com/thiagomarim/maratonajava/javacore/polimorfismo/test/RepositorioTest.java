package com.thiagomarim.maratonajava.javacore.polimorfismo.test;

import com.thiagomarim.maratonajava.javacore.polimorfismo.repositiorio.Repositorio;
import com.thiagomarim.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import com.thiagomarim.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
//        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}

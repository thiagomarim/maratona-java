package com.thiagomarim.maratonajava.javacore.interfaces.dominio;

public class DatabaseLoader implements DataLoad, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados....");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados....");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissao do usuário para acessar os dados do banco de dados!");
    }
}

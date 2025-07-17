package com.thiagomarim.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DataLoad, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize dentro do classe");
    }
}

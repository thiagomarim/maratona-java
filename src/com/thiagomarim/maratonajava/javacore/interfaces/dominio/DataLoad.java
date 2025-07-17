package com.thiagomarim.maratonajava.javacore.interfaces.dominio;

public interface DataLoad {
    void load();

    default void checkPermission() {
        System.out.println("Checando permissao do usuário");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}

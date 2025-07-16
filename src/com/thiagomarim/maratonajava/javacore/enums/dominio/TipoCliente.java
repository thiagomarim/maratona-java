package com.thiagomarim.maratonajava.javacore.enums.dominio;

public enum TipoCliente {
    PESSOA_JURIDICA("Pessoa Jurídica"),
    PESSOA_FISICA("Pessoa Física");

    public final String nome;

     TipoCliente(String nome) {
        this.nome = nome;
    }

    public static TipoCliente tipoClientePorNome(String tipoClientePorNome) {
         for (TipoCliente value: values()) {
             System.out.println(value);
             if (value.getNome().equals(tipoClientePorNome)) {
                 return value;
             }
         }
         return null;
    }

    public String getNome() {
        return nome;
    }
}

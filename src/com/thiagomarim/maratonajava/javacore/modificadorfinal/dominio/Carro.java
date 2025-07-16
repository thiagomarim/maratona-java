package com.thiagomarim.maratonajava.javacore.modificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final int VELOCIDADE_LIMITE = 250;
    public static final Comprador COMPRADOR = new Comprador();

    public Carro() {
    }

    public final void imprimir() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

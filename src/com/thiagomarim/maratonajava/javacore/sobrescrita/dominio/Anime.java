package com.thiagomarim.maratonajava.javacore.sobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

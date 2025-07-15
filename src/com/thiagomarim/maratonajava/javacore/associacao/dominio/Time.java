package com.thiagomarim.maratonajava.javacore.associacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprimir() {
        if (nome == null) return;
        System.out.println("----Time----");
        System.out.println("Nome: " + this.nome);

        if (jogadores == null) return;
        System.out.println("----Jogadores----");
        for (Jogador jogador : jogadores) {
            System.out.println("Nome: " + jogador.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this(nome);
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

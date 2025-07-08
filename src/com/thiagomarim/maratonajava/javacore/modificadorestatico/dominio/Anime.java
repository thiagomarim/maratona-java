package com.thiagomarim.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Ordem de execucao
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço na memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada;
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização nao estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Anime.episodios = episodios;
    }
}

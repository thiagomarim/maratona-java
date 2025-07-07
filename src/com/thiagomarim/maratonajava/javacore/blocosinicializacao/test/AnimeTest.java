package com.thiagomarim.maratonajava.javacore.blocosinicializacao.test;

import com.thiagomarim.maratonajava.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");

        for ( int episodio: anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}

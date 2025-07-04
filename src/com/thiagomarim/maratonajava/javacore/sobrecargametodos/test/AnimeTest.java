package com.thiagomarim.maratonajava.javacore.sobrecargametodos.test;

import com.thiagomarim.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        // Não está utilizando o novo parametro passado com o overload.
        Anime anime = new Anime("Naruto", "Manga", 22);
        // Está utilizando o novo parametro passado com o overload.
        Anime anime2 = new Anime("Naruto", "Manga", 22, "Acao");

        System.out.println(anime);
        System.out.println(anime2);
    }
}

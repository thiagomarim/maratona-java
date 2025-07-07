package com.thiagomarim.maratonajava.javacore.construtores.test;

import com.thiagomarim.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        // Não está utilizando o novo parametro passado com o overload.
        Anime anime = new Anime("Naruto", "Manga", 22, "Acao");
        // Está utilizando o novo parametro passado com o overload.
        Anime anime2 = new Anime("Haikyuu", "TV", 11, "Acao", "Production IG");

        anime.imprimir();
        anime2.imprimir();
    }
}

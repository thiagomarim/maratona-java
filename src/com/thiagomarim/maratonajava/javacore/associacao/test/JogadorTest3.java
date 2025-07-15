package com.thiagomarim.maratonajava.javacore.associacao.test;

import com.thiagomarim.maratonajava.javacore.associacao.dominio.Jogador;
import com.thiagomarim.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafú");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Brasil", jogadores);


        time.imprimir();

    }
}

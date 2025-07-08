package com.thiagomarim.maratonajava.javacore.associacao.test;

import com.thiagomarim.maratonajava.javacore.associacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }
    }
}

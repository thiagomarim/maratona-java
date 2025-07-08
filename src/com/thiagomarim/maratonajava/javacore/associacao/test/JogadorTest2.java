package com.thiagomarim.maratonajava.javacore.associacao.test;

import com.thiagomarim.maratonajava.javacore.associacao.dominio.Jogador;
import com.thiagomarim.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Vinicius Junior");
        Time time = new Time("Real Madrid");

        jogador.setTime(time);

        jogador.imprimir();
    }
}

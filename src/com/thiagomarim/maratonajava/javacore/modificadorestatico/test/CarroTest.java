package com.thiagomarim.maratonajava.javacore.modificadorestatico.test;

import com.thiagomarim.maratonajava.javacore.modificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 295);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Ferrari", 320);

        Carro.velocidadeLimite = 300;

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}

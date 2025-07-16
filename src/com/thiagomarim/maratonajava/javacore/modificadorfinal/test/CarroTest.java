package com.thiagomarim.maratonajava.javacore.modificadorfinal.test;

import com.thiagomarim.maratonajava.javacore.modificadorfinal.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Thiago");
        System.out.println(carro.COMPRADOR);
    }
}

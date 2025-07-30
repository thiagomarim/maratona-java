package com.thiagomarim.maratonajava.javacore.polimorfismo.test;

import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Computador;
import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Tomate;
import com.thiagomarim.maratonajava.javacore.polimorfismo.servico.CalculadoraDeImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("i5-11400f", 12000);
        Tomate tomate = new Tomate("Tomate Siciliano", 100);

        tomate.setDataDeValidade("20/06/2025");

        CalculadoraDeImposto.calcularImposto(computador);
        CalculadoraDeImposto.calcularImposto(tomate);
    }
}

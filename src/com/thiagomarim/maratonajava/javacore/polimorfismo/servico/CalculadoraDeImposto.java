package com.thiagomarim.maratonajava.javacore.polimorfismo.servico;

import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Computador;
import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Produto;
import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraDeImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de Validade: " + tomate.getDataDeValidade());
        }
        System.out.println("---------------------------------------");
    }
}

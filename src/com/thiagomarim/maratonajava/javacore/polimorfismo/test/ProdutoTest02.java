package com.thiagomarim.maratonajava.javacore.polimorfismo.test;

import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Computador;
import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Produto;
import com.thiagomarim.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Produto produto2 = new Tomate("Americano", 20);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}

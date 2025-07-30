package com.thiagomarim.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto {
    private static final double VALOR_IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador...");
        return this.valor * VALOR_IMPOSTO;
    }
}

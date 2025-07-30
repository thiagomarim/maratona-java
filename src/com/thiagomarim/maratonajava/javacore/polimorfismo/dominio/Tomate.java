package com.thiagomarim.maratonajava.javacore.polimorfismo.dominio;

public class Tomate extends Produto{
    private static final double VALOR_IMPOSTO = 0.06;
    private String dataDeValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate...");
        return this.valor * VALOR_IMPOSTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}

package com.thiagomarim.maratonajava.introducao.exercicios;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        double salarioAnual = 20000;
        double primeraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            salarioAnual *= primeraFaixa;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
            salarioAnual *= segundaFaixa;
        } else {
            salarioAnual *= terceiraFaixa;
        }

        valorImposto = salarioAnual;

        System.out.println("Voce pagará de imposto: " + valorImposto);
    }
}

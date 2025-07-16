package com.thiagomarim.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, String cpf, Endereco endereco, double salario) {
        super(nome, idade, cpf, endereco);
        this.salario = salario;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

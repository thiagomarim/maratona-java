package com.thiagomarim.maratonajava.javacore.metodos.exercicio.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimir() {
        System.out.println("-------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if ( salarios != null) {
            for (double salario : salarios) {
                System.out.println("Salario: " + salario);
            }
        }
        mediaSalarios();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void mediaSalarios() {
        if (salarios != null) {
            for (double salary : salarios ) {
                media += salary;
            }
            media /= salarios.length;
        }

        System.out.println("----------------");
        System.out.println("Média salarial: " + media );
    }
}

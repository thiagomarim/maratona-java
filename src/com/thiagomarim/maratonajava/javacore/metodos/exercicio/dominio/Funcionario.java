package com.thiagomarim.maratonajava.javacore.metodos.exercicio.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

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

    public void mediaSalarios() {
        double media = 0;
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

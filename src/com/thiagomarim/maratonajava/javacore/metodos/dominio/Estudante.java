package com.thiagomarim.maratonajava.javacore.metodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimir() {
        System.out.println("---------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}

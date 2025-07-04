package com.thiagomarim.maratonajava.javacore.modificadoracesso.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (this.idade < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}

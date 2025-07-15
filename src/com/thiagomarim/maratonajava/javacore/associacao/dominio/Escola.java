package com.thiagomarim.maratonajava.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println("Nome do Professor: " + professor.getNome());
        }
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

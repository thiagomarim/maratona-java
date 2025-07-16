package com.thiagomarim.maratonajava.javacore.modificadorfinal.dominio;

public class Ferrari extends Carro {
    private String nome;

    public Ferrari(String nome) {
        this.nome = nome;
    }

    /* Não posso ser sobrescrita, pois o metodo herdado é um final
       public void imprimir() {
        }
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package com.thiagomarim.maratonajava.javacore.classesabstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        salario += salario * 0.2;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

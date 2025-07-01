package com.thiagomarim.maratonajava.introducao.exercicios;

/*
 Crie variáveis para os campos descritos abaixo
 entre <> e imprima a seguinte mensagem:

 Eu <nome>, morando no endereco <endereco>,
 confirmo que recebi o salário de <salário>, na data <data>.
 */


public class TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Thiago";
        String endereco = "Sao Paulo - Vila Medeiros";
        double salario = 1400.00;
        String data = "22/07/2025";

        System.out.println("Eu " + nome + ", morando no endereco " + endereco +
                ", confirmo que recebi o salário de " + salario + ", na data " + data + "."
                );

    }
}

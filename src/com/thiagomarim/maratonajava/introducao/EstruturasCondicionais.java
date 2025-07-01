package com.thiagomarim.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;

        // IF
        if (idade>= 18) {
            System.out.println("Voce pode tirar a sua habilitacao");
        } else {
            System.out.println("Voce nao é maior de idade para tirar a sua habilitacao");
        }

        // IF ELSE
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade <= 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }

        // Ternário
        double salario = 5200;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo!";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";
        String resutaldo = salario >= 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resutaldo);
    }
}

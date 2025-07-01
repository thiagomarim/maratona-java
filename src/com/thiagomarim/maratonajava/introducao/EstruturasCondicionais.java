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

        // Switch
        byte dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao inválida");
        }

        char sexo = 'F';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opcao Inválida");
        }
    }
}

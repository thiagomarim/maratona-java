package com.thiagomarim.maratonajava.introducao.exercicios;

public class EstruturaCondicionalSwitch {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia
        // util ou final de semana.
        // Considerando 1 como Domingo

        byte dia = 7;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}

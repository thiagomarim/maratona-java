package com.thiagomarim.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // Aritiméticos
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 * numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // Relacionais
        //  > < >= <= == !=
        boolean dezMaiorVinte = 10 > 20;
        boolean dezMenorVinte = 10 < 20;
        boolean dezIgualVinte = 10 == 20;
        boolean dezIgualDez = 10 == 10;
        boolean dezDiferenteDez = 10 != 10;
        System.out.println("Dez é maior que vinte? " + dezMaiorVinte);
        System.out.println("Dez é menor que vinte? " + dezMenorVinte);
        System.out.println("Dez é igual á vinte? " + dezIgualVinte);
        System.out.println("Dez é igual á dez? " + dezIgualDez);
        System.out.println("Dez é diferente de dez? " + dezDiferenteDez);

        // Lógicos
        // && (and) || (or)
        int idade = 32;
        float salario = 3500F;
        boolean maiorQueTrinta = idade > 30 && salario >= 4612;
        boolean menorQueTrinta = idade < 30 && salario >= 3300;

        System.out.println("Maior do que trinta? " + maiorQueTrinta);
        System.out.println("Menor do que trinta? " + menorQueTrinta);

        double valorContaCorrente= 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean playstationCincoCompravel = valorTotalContaPoupanca > valorPlaystation || valorContaCorrente > valorPlaystation;

        System.out.println("Posso comprar um PS5? " + playstationCincoCompravel);

        // Atribuicao
        // = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3200
        bonus /= 2; // 900
        bonus %= 1; // 0.0

        System.out.println(bonus);

        // ++ --
        int contador = 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 1;
        System.out.println(++contador2);
    }
}

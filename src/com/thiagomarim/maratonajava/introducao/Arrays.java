package com.thiagomarim.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {
        int[] idades = new int[4];

        idades[0] = 19;
        idades[1] = 12;
        idades[2] = 26;
        idades[3] = 55;

        // ForEach - Utilizado para percorrer uma Lista, e acessar
        // os valores dela.
        // Ponto negativo: Não temos acesso ao index da Lista que estamos
        // a percorrer.
        for (int idade : idades) {
            System.out.println(idade);
        }

        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        // For i - Também é utilizado para percorrer uma lista,
        // é mais utilizado quando queremos ter acesso ao index do item da lista.
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // Formas de se inicializar um Array
        int[] numeros = new int[4]; // Setando apenas o tamanho do Array
        int[] numeros2 = {1,2,3,4,5}; // Inicializando com valores
        int[] numeros3 = new int[]{1,2,3}; // Instanciado um INT com valores
    }
}

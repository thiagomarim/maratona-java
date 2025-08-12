package com.thiagomarim.maratonajava.javacore.regex;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Eren,Levi,Mikasa,true,200";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("Int: " + i);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("Boolean: " + b);
            } else {
                System.out.println(sc.next());
            }
        }
    }
}

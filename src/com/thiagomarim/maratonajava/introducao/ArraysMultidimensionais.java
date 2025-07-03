package com.thiagomarim.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 36;

        dias[1][0] = 5;
        dias[1][1] = 22;
        dias[1][2] = 35;

        dias[2][0] = 23;
        dias[2][1] = 22;
        dias[2][2] = 15;

        for (int[] dia : dias) {
            for (int num: dia) {
                System.out.println(num);
            }
        }
    }
}

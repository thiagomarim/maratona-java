package com.thiagomarim.maratonajava.javacore.excecao.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (ArithmeticException e ){
            e.printStackTrace();
        }

        System.out.println("Código finalizado!");
    }

    /**
     *
     * @param a
     * @param b nao pode ser 0
     * @return
     * @throws IllegalArgumentException caso B seja 0
     */
    public static int divisao(int a, int b) {
        if (b != 0) {
            throw new IllegalArgumentException("Argumento ilegal, nao pode ser 0!");
        }
        return a / b;
    }
}

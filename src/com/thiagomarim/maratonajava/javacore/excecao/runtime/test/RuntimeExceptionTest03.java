package com.thiagomarim.maratonajava.javacore.excecao.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abrirConexcao();
    }

    private static String abrirConexcao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexao aberta";
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo o SO");
        }
        return null;
    }

    private static void abrirConexcao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo o SO");
        }
    }
}

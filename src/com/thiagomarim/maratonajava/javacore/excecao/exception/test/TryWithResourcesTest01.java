package com.thiagomarim.maratonajava.javacore.excecao.exception.test;

import com.thiagomarim.maratonajava.javacore.excecao.exception.dominio.Leitor1;
import com.thiagomarim.maratonajava.javacore.excecao.exception.dominio.Leitor2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    private static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2();) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

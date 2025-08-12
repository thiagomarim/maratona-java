package com.thiagomarim.maratonajava.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter (fw);
        ) {
            bw.write("O curso do Dev dojo é o melhor do Brasillllllllllllllllll");
            bw.newLine();
            bw.write("Continuando em outra linha");
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

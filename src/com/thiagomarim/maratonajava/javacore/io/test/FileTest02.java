package com.thiagomarim.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("isDiretorioCreated: " + isDiretorioCreated);

        File fileInDiretorio = new File(fileDiretorio,"texto.txt");
        boolean isFileCreated = fileInDiretorio.createNewFile();
        System.out.println("isFileCreated in Diretorio: " + isFileCreated);

        File fileRename = new File(fileDiretorio,"text_renomeado.txt");
        boolean isFileRenamed = fileInDiretorio.renameTo(fileRename);
        System.out.println("isFileRenamedCreated :" + isFileRenamed );

        File diretorioRenamed = new File("pasta-renomeada");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("isDiretorioRenamed :" + isDiretorioRenamed );
    }
}

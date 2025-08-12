package com.thiagomarim.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created: " + isCreated);
            System.out.println("path" + file.getPath());
            System.out.println("absolute path" + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + new Date(file.lastModified()));
            boolean fileExist = file.exists();

            if (fileExist) {
                boolean isDeleted = file.delete();
                System.out.println("Is deleted: " + isDeleted);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

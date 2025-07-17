package com.thiagomarim.maratonajava.javacore.interfaces.test;

import com.thiagomarim.maratonajava.javacore.interfaces.dominio.DataLoad;
import com.thiagomarim.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import com.thiagomarim.maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoadTest {
    public static void main(String[] args) {
        FileLoader fileLoader = new FileLoader();
        DatabaseLoader databaseLoader = new DatabaseLoader();

        fileLoader.load();
        databaseLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoad.retrieveMaxDataSize();
        FileLoader.retrieveMaxDataSize();
    }
}

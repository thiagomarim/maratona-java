package com.thiagomarim.maratonajava.javacore.excecao.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro de IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro de IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro de ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }

        try {
            talvezLanceUmaException();
        } catch (SQLException e ){
            e.printStackTrace();
        } catch (FileNotFoundException e ){
            e.printStackTrace();
        }
    }

    private static void talvezLanceUmaException() throws SQLException, FileNotFoundException {

    }
}

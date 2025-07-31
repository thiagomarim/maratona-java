package com.thiagomarim.maratonajava.javacore.excecao.exception.test;

import com.thiagomarim.maratonajava.javacore.excecao.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        logar();
    }

    private static void logar() {
        Scanner scanner = new Scanner(System.in);

        String usernameDB = "Thiago";
        String passwordDB = "123";

        String senhaDigitada;
        String nomeUsuarioDigitado;

        System.out.println("Usuário: ");
        nomeUsuarioDigitado = scanner.nextLine();

        System.out.println("Senha: ");
        senhaDigitada = scanner.nextLine();

        if (!usernameDB.equals(nomeUsuarioDigitado) || !passwordDB.equals(senhaDigitada)) {
            try {
                throw new LoginInvalidoException("Usuário ou senha inválidos!!");
            } catch (LoginInvalidoException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Usuário logado com sucesso!");
        }




        scanner.close();
    }
}

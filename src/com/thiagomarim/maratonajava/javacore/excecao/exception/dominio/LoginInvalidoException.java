package com.thiagomarim.maratonajava.javacore.excecao.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}

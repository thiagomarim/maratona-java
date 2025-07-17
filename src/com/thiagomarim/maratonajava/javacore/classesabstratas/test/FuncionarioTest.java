package com.thiagomarim.maratonajava.javacore.classesabstratas.test;

import com.thiagomarim.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import com.thiagomarim.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Robson", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Thiago", 22000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}

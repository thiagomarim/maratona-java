package com.thiagomarim.maratonajava.javacore.associacao.test;

import com.thiagomarim.maratonajava.javacore.associacao.dominio.Escola;
import com.thiagomarim.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprimir();
    }
}

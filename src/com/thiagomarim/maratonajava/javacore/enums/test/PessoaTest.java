package com.thiagomarim.maratonajava.javacore.enums.test;

import com.thiagomarim.maratonajava.javacore.enums.dominio.Pessoa;
import com.thiagomarim.maratonajava.javacore.enums.dominio.TipoCliente;
import com.thiagomarim.maratonajava.javacore.enums.dominio.TipoPagamento;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Thiago", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Pessoa pessoa2 = new Pessoa("Roberto", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(200.00));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(200.00));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNome("Pessoa Jurídica");
        System.out.println(tipoCliente);
    }
}

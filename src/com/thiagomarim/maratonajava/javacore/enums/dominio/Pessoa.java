package com.thiagomarim.maratonajava.javacore.enums.dominio;

public class Pessoa {
    private String nome;
    private TipoCliente tipoPessoa;
    private TipoPagamento tipoPagamento;

    public Pessoa(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoPessoa = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoCliente tipoCliente) {
        this.tipoPessoa = tipoCliente;
    }
}

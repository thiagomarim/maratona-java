package com.thiagomarim.maratonajava.javacore.enums.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(Double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(Double valor) {
            return valor * 0.05;
        }
    };



    public abstract double calcularDesconto(Double valor);
}

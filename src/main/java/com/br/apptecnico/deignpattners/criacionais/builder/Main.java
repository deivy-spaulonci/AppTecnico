package com.br.apptecnico.deignpattners.criacionais.builder;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro.Builder("Toyota", "Corolla")
                .ano(2020)
                .cor("Vermelho")
                .build();
        System.out.println(carro);
    }

}

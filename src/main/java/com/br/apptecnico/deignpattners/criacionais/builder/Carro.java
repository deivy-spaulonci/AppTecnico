package com.br.apptecnico.deignpattners.criacionais.builder;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private Carro(Builder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.ano = builder.ano;
        this.cor = builder.cor;
    }

    public static class Builder {
        private String marca;
        private String modelo;
        private int ano;
        private String cor;
        public Builder(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }
        public Builder ano(int ano) {
            this.ano = ano;
            return this;
        }
        public Builder cor(String cor) {
            this.cor = cor;
            return this;
        }
        public Carro build() {
            return new Carro(this);
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }

}

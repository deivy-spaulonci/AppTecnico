package com.br.apptecnico.deignpattners.criacionais.factory;

public class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("miau!");
    }
}

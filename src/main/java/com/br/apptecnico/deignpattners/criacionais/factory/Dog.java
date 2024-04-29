package com.br.apptecnico.deignpattners.criacionais.factory;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("wof!");
    }
}

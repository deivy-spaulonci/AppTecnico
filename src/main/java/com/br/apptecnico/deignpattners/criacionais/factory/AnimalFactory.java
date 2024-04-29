package com.br.apptecnico.deignpattners.criacionais.factory;

public class AnimalFactory {
    public Animal createAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        return null;
    }

}

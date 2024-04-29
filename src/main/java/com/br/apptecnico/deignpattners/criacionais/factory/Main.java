package com.br.apptecnico.deignpattners.criacionais.factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal("Dog");
        dog.makeSound(); // Output: Woof!

        Animal cat = animalFactory.createAnimal("Cat");
        cat.makeSound(); // Output: Meow!
    }
}

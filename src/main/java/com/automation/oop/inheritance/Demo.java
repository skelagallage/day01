package com.automation.oop.inheritance;

public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.eat();

        Dog dog = new Dog("Dog");
        dog.eat();

        Animal animalDog = new Dog("AnimalDog");
        animalDog.eat();
    }
}

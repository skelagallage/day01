package com.automation.oop.superdemo;

public class Dog extends Animal{
    String breed;

    Dog(String species, String breed) {
        super(species); // Calls the constructor of the Animal class
        this.breed = breed;
        System.out.println("Dog class constructor is called");
    }

    void sound() {
        super.sound(); // Calls the sound() method of the superclass
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("abc", "xyz");
        dog.sound();
    }
}

package com.automation.oop.superdemo;

public class Animal {

    int legs = 4;

    String species;

    Animal(){}
    Animal(String species) {
        this.species = species;
        System.out.println("Animal class constructor is called. ");
    }


    void sound() {
        System.out.println("Animal makes a sound");
    }

}

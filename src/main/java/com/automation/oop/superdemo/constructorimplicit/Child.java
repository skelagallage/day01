package com.automation.oop.superdemo.constructorimplicit;

public class Child extends Parent{

    public Child(){
//        super();
        System.out.println("Child is called.");
    }

    public static void main(String[] args) {
        Child child = new Child();

    }
}

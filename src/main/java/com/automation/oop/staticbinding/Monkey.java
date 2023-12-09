package com.automation.oop.staticbinding;

public class Monkey {

    public void eat(Food food){
        System.out.println("Monkey is eating a food");
    }

    public void eat(Banana banana){
        System.out.println("Monkey is eating a banana");
    }
}

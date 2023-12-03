package com.automation.oop;

public class ClassDemo {

    String name;
    int age;

    public ClassDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ClassDemo classDemo = new ClassDemo("Sanath", 35);
        System.out.println(classDemo.name);
        System.out.println(classDemo.age);
    }
}

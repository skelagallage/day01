package com.automation.oop.accessmodifiers.pkgone;

public class Parent {

    private int x = 2;

    int y = 3;

    protected int z = 4;

    public int a = 5;

    public void display(){
        System.out.println("Value of the x is : " + x);
        System.out.println("Value of the y is : " + y);
        System.out.println("Value of the z is : " + z);
        System.out.println("Value of the z is : " + a);
    }
}

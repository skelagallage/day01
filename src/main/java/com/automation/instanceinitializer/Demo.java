package com.automation.instanceinitializer;

public class Demo {

    // instance variable
    int x;

    // instance initializer
    {
        System.out.println("Instance initializer is called.");
        // code to initialize x
        x = 10;
        System.out.println("Instance initializer executed.");
    }

    public Demo(){
        System.out.println("Constructor is called.");
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("Value of x is : " + demo.x);
    }

}

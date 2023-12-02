package com.automation.variables;

public class VariableDemo {

    int instanceVar = 20;

    public static void main(String[] args) {
        int localVar = 10; // This is a local variable
        System.out.println("Local Variable: " + localVar);

        VariableDemo variableDemo1 = new VariableDemo();
        VariableDemo variableDemo2 = new VariableDemo();
        System.out.println("instanceVar of variableDemo1 is : " + variableDemo1.instanceVar);
        System.out.println("instanceVar of variableDemo2 is : " + variableDemo2.instanceVar);
    }
}

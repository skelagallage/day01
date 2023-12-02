package com.automation.conditions;

public class ConditionsDemo {
    public static void main(String[] args) {
        int x = 4;
        if(x == 4){
            System.out.println("x is 4");
        }
        if(x == 5){
            System.out.println("x is 5");
        }

        System.out.println("if-else example");
        System.out.println("----------------");
        int y = 5;
        if(y == 4){
            System.out.println("y is 4");
        }else{
            System.out.println("y is not 4");
        }

        System.out.println("if-else-if example");
        System.out.println("----------------");
        int age = 55;
        if(age <18){
            System.out.println("you are a child");
        }else if(age <35){
            System.out.println("You are adult and less than 35");
        }else if(age < 55){
            System.out.println("You are adult and less than 55");
        }else {
            System.out.println("You are more than 55");
        }

        // nested if
        System.out.println("nested example");
        System.out.println("----------------");
        if(age>18){
            if(age<45){
                System.out.println("less than 45");
            }
            if(age<65){
                System.out.println("less than 65");
            }
        }
    }
}

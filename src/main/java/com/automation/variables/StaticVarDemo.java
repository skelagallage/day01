package com.automation.variables;

public class StaticVarDemo {

    int x = 0;

    static int y = 0;

    public StaticVarDemo(){
//        System.out.println("check print...");
        x++;
        y++;

        System.out.println("value of x is : " + x);
        System.out.println("value of y is : " + y);
    }

    public static void main(String[] args) {
        StaticVarDemo staticVarDemo1 = new StaticVarDemo();
        StaticVarDemo staticVarDemo2 = new StaticVarDemo();

    }
}

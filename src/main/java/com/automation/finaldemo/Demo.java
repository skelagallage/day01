package com.automation.finaldemo;

public class Demo {

    final int MAX_VALUE = 100;

    final void display() {
        System.out.println("This is a final method.");

        /**
         * You can't change value of MAX_VALUE as follows.
         * because it is final.
         */
//        MAX_VALUE = 300;
    }

    public static void main(String[] args) {

    }
}

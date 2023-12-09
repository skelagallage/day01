package com.automation.oop.accessmodifiers.pkgone;

public class ParentSibling {

    public void display(){
        Parent parent = new Parent();
        /**
         * If you uncomment the following line
         * it will give you the compilation err.
         * x is private and it can be accessed
         * only within the Parent class
         */
//        System.out.println(parent.x);

        /**
         * You can access the y variable as below
         * because 'y' is belongs to package 'pkgone'
         */
        System.out.println(parent.y);

        /**
         * You can access z from here.
         * becuase z is getting protected access modifier
         * and is accessible within the same package
         */
        System.out.println(parent.z);
    }
}

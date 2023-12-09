package com.automation.oop.accessmodifiers.pkgtwo;

import com.automation.oop.accessmodifiers.pkgone.Parent;

public class Neighbour {

    public void display(){
        Parent parent = new Parent();
        /**
         * You cannot access variable y as below.
         * because y is belongs to package pkgone and
         * y is having default access modifier.
         */
//        System.out.println(parent.y);

        /**
         * You cannot access z from the outside of its package
         * becuase z is protected.
         */
//        System.out.println(parent.z);

        /**
         * You can access variable a from here.
         * becuase it is getting public access modifier.
         */
        System.out.println(parent.a);
    }
}

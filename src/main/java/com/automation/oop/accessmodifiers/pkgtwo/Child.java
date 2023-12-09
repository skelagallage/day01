package com.automation.oop.accessmodifiers.pkgtwo;

import com.automation.oop.accessmodifiers.pkgone.Parent;

public class Child extends Parent {

    public void display(){
        /**
         * You can directly access variable z belogns to pkgone
         * because Child is inherited from the Parent.
         * No need to create object of Parent class.
         */
        System.out.println(z);
    }
}

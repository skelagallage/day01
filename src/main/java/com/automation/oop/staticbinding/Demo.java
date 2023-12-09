package com.automation.oop.staticbinding;

public class Demo {

    public static void main(String[] args) {
        Food food = new Food();
        Banana banana = new Banana();
        Food foodBanana = new Banana();

        Monkey monkey1 = new Monkey();
        monkey1.eat(food);
        Monkey monkey2 = new Monkey();
        monkey2.eat(banana);
        Monkey monkey3 = new Monkey();
        monkey3.eat(foodBanana);
    }


}

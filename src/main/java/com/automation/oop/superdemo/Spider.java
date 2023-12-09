package com.automation.oop.superdemo;

public class Spider extends Animal{
    int legs = 8;

    void displayLegs() {
        System.out.println("Spider legs: " + legs);
        System.out.println("Animal legs: " + super.legs);
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.displayLegs();
    }

}

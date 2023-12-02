package com.automation.conditions;

public class SwitchDemo {
    public static void main(String[] args) {
        int day = 1;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day is " + dayName);
    }
}

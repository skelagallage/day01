package com.automation.conditions;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("iteration : " + i);
        }

        //enhance for loop
        System.out.println("enhance for loop");
        System.out.println("------------------");
        int[] intArr = {3,4,5,6,7,8};
        for(int x : intArr){
            System.out.println("current element : " + x);
        }
//Iterate using normal for loop
        System.out.println();
        System.out.println("iterate using normal for loop");
        for(int i=0; i<intArr.length; i++){
            System.out.println("current element : " + intArr[i]);
        }

        //Enhance for loop for list
        System.out.println();
        System.out.println("Enhance for loop for list");

        List<String> strList = new ArrayList<>();
        strList.add("Sanath");
        strList.add("Haritha");
        strList.add("Rasara");
        strList.add("Thiuni");

        for(String str : strList){
            System.out.println("Name is : " + str);
        }
    }
}

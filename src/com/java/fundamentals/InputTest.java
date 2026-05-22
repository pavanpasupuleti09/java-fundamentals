package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        byte age = sc.nextByte();
        System.out.println("Age : " + age);


        System.out.println("Enter salary");
        int salary = sc.nextInt();
        System.out.println("Salary : " + salary);

        System.out.println("Enter Mobile");
        long mobile = sc.nextLong();
        System.out.println("Mobile : " + mobile);

        System.out.println("Enter Discount");
        float discount = sc.nextFloat();
        System.out.println("Discount : " + discount);



        System.out.println("Is Stock Avaialble true/false");
        boolean isStockAvailable = sc.nextBoolean();
        System.out.println("Is Stock Available : " + isStockAvailable);
        sc.close();
    }

}



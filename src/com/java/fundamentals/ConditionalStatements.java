package com.java.fundamentals;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("your eligible to vote ");
        }else{
            System.out.println("your not eligible to vote");
        }
        boolean isStockAvailable = true;
        if (isStockAvailable){
            System.out.println("stock is available ");
        }else{
            System.out.println("stock is not available ");
        }

    }
}

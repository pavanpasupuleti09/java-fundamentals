package com.java.fundamentals;

import java.util.Scanner;

public class ScannerAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Of Product : ");
        String name = sc.nextLine();
        System.out.println("Enter Discount Percentage : ");
        float discountPercentage = sc.nextFloat();
        System.out.println("Enter Price Of Product :  ");
        int price = sc.nextInt();
        System.out.println("Enter Rating Of Product : " );
        float rating = sc.nextFloat();
        System.out.println("Enter Colour Of Product : ");
        String colour = sc.nextLine();
        System.out.println(" Is In Stock (True/False) : ");
        boolean isAvailable = sc.nextBoolean();

        System.out.println("Name Of Product : " + name);
        System.out.println("Discount Percentage : " + discountPercentage);
        System.out.println("Price Of Product : " + price);
        System.out.println("Rating Of Product : " + rating);
        System.out.println("Colour Of Product : " + colour);
        System.out.println("Is In Stock : " + isAvailable);


    }
}

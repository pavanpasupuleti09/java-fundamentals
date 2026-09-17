package com.java.fundamentals;

import java.util.Scanner;

public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        int productId = scanner.nextInt();
        System.out.println("Category Code : ");
        char code = scanner.next().charAt(0);
        System.out.println("Enter No of Quantity Available : ");
        short quantity =scanner.nextShort();
        System.out.println("Enter Unit Price : ");
        double unitPrice = scanner.nextDouble();
        System.out.println("Discount Percentage : ");
        float discountPercentage = scanner.nextFloat();
        System.out.println("Enter Supplier Contact : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Is Available : ");
        boolean isAvailable = scanner.nextBoolean();
        System.out.println("Enter Rating : ");
        float rating = scanner.nextFloat();



        System.out.println("--- Product Details ---");
        System.out.println("ID: " + productId);
        System.out.println("Category: " + code);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + unitPrice);
        System.out.println("Discount: " + discountPercentage);
        System.out.println("Supplier Contact: " + mobileNumber);
        System.out.println("Available: " + isAvailable);
        System.out.println("Rating: " + rating);

        scanner.close();
    }
}

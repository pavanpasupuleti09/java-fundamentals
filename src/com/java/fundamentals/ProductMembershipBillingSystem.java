package com.java.fundamentals;

import java.util.Scanner;

public class ProductMembershipBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Price :");
        int productPrice = scanner.nextInt();
        System.out.println("Enter Membership Type :");
        char membership = scanner.next().charAt(0);
        System.out.println("Quantity :");
        byte quantity = scanner.nextByte();
        byte discountPercentage, shippingCharges;
        int discountedAmount;
        int discountedPrice;
        double finalPricePerProduct;
        if (membership == 'S') {
            discountPercentage = 10;
            shippingCharges = 50 ;
        } else if (membership == 'G') {
            discountPercentage = 15;
            shippingCharges = 20;
        } else if (membership == 'D') {
            discountPercentage = 20;
            shippingCharges = 0;
        } else{
            discountPercentage = 0;
            shippingCharges = 100;
     }
        discountedAmount = productPrice * discountPercentage / 100;

        discountedPrice = productPrice - discountedAmount;
        double centralTaxAmount = discountedPrice * 2.5/100;
        double stateTaxAmount = discountedPrice * 2.5/100;

        double finalDiscountPerProduct = productPrice * discountPercentage / 100;
        finalPricePerProduct = discountedPrice + stateTaxAmount + centralTaxAmount;
        double finalPrice = finalPricePerProduct * quantity;
        double amountSaved = discountedAmount * quantity ;
        double finalBill = finalPrice + shippingCharges;


        System.out.println("Product price : " + productPrice);
        System.out.println("Discount ammount : " + discountedAmount);
        System.out.println("Final price per product " + finalPricePerProduct);
        System.out.println("Final bill ammount : " + finalBill );
        System.out.println("Total amount saved : " + amountSaved);



}
}





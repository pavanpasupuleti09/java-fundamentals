package com.java.fundamentals;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To E-commerce App");
        System.out.println("Choose the category");
        System.out.println("1.MEN");
        System.out.println("2.WOMEN");
        System.out.println("3.KIDS");
        byte category = scanner.nextByte();
        switch (category) {
            case 1:
                System.out.println("Welcome to Mens section");
                System.out.println("chose category");
                System.out.println("1.Shirts");
                System.out.println("2.T-shirts");
                System.out.println("3.Jeans");
                byte category2 = scanner.nextByte();
                switch (category2) {
                    case 1:
                        System.out.println("Welcome to Shirts section");
                        break;
                    case 2:
                        System.out.println("Welcome to T-shirts section");
                        break;
                    case 3:
                        System.out.println("Welcome to Jeans section");
                        break;
                }

                break;
            case 2:
                System.out.println("Welcome to Womens section");
                System.out.println("chose category");
                System.out.println("1.Tops");
                System.out.println("2.T-shirts");
                System.out.println("3.Jeans");
                byte category3 = scanner.nextByte();
                switch (category3) {
                    case 1:
                        System.out.println("Welcome to Tops section");
                        break;
                    case 2:
                        System.out.println("Welcome to T-shirts section");
                        break;
                    case 3:
                        System.out.println("Welcome to Jeans section");
                        break;
                }
                break;
            case 3:
                System.out.println("Welcome to Kids section");
                System.out.println("chose category");
                System.out.println("1.Shirts");
                System.out.println("2.T-shirts");
                System.out.println("3.Jeans");
                byte category4 = scanner.nextByte();
                switch (category4) {
                    case 1:
                        System.out.println("Welcome to Shirts section");
                        break;
                    case 2:
                        System.out.println("Welcome to T-shirts section");
                        break;
                    case 3:
                        System.out.println("Welcome to Jeans section");

                }

        }

    }
}

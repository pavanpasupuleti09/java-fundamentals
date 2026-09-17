package com.java.fundamentals;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Enter age : ");
        byte age = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Enter your father name : ");
        String fatherName = scanner.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Father name : " + fatherName);

        scanner.close();

    }
}

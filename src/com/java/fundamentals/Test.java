package com.java.fundamentals;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int N = sc.nextInt();

        int largest = 0;

        for (int count = 1; count <= N; count++) {

            System.out.print("Enter number: ");
            int number = sc.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest = " + largest);
    }
}
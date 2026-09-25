package com.java.fundamentals;

import java.util.Scanner;

public class IterativeStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no : ");
        int N = scanner.nextInt();
        int number = 1;
        while (number<=N){
            if (number % 2 == 0){
                System.out.println(number);
            }
            number++;
        }

    }
}

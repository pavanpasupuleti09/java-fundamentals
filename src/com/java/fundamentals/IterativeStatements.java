package com.java.fundamentals;

import java.util.Scanner;

public class IterativeStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int N = scanner.nextInt();
        int number = 1;// loop counter
        while (number<=N){
            if (number % 2 == 0){
                System.out.println(number);
            }
            number++;
        }
        System.out.println("Enter number  : ");
        int N1 = scanner.nextInt();
        for (int number1 = 1;number1 <=N1;number1++){
            if (number1%2 ==0)
                System.out.println(number1);
            }

        }



    }


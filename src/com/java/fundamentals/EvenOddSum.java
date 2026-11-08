package com.java.fundamentals;

public class EvenOddSum {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 22, 7, 18, 9, 4};

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

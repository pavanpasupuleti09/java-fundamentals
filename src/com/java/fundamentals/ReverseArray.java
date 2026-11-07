package com.java.fundamentals;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("\nReversed array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

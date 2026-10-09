package com.java.fundamentals;

public class LargestNumber {
    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 8, 32};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}

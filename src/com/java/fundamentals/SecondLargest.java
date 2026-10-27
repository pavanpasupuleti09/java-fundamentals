package com.java.fundamentals;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 34, 67};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
}

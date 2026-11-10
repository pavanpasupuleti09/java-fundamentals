package com.java.fundamentals;

public class LargestSmallestDifference {
    public static void main(String[] args) {

        int[] numbers = {45, 12, 78, 23, 90, 34};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Difference: " + difference);
    }
}


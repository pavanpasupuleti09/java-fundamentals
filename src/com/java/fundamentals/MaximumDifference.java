package com.java.fundamentals;

public class MaximumDifference {
    public static void main(String[] args) {

        int[] numbers = {7, 1, 5, 3, 6, 4};

        int minValue = numbers[0];
        int maxDifference = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {

            int difference = numbers[i] - minValue;

            if (difference > maxDifference) {
                maxDifference = difference;
            }

            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        System.out.println("Maximum difference: " + maxDifference);
    }
}

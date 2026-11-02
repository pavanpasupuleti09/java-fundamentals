package com.java.fundamentals;

public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6, 7};

        int n = 7;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }

}

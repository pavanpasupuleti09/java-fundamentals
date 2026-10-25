package com.java.fundamentals;

public class CountNumbers {
    public static void main(String[] args) {

        int[] numbers = {10, -5, 20, -8, 0, 15};

        int positive = 0;
        int negative = 0;

        for (int number : numbers) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}


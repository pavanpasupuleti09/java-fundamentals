package com.java.fundamentals;

public class DigitFrequency {
    public static void main(String[] args) {
        int number = 122333;
        int[] frequency = new int[10];

        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " appears " + frequency[i] + " times");
            }
        }
    }
}

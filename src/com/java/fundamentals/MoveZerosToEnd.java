package com.java.fundamentals;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] numbers = {10, 0, 20, 0, 30, 40, 0, 50};

        int index = 0;

        // Move non-zero elements to the beginning
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

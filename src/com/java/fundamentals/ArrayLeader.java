package com.java.fundamentals;

public class ArrayLeader {
    public static void main(String[] args) {

        int[] numbers = {16, 17, 4, 3, 5, 2};

        System.out.println("Leader elements:");

        for (int i = 0; i < numbers.length; i++) {

            boolean isLeader = true;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] <= numbers[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(numbers[i] + "  ");
            }
        }
    }
}

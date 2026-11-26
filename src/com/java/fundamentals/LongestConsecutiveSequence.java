package com.java.fundamentals;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] numbers = {100, 4, 200, 1, 3, 2};

        int longest = 0;

        for (int i = 0; i < numbers.length; i++) {

            int count = 1;
            int current = numbers[i];

            while (true) {
                boolean found = false;

                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == current + 1) {
                        current++;
                        count++;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break;
                }
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest consecutive sequence length: " + longest);
    }
}

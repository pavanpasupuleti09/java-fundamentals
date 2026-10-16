package com.java.fundamentals;
public class SumNumbers {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 5) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}

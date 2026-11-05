package com.java.fundamentals;

public class ArrayEquality {
    public static void main(String[] args) {

        int[] first = {10, 20, 30, 40};
        int[] second = {10, 20, 30, 40};

        boolean isEqual = true;

        if (first.length != second.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}

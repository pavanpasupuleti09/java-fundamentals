package com.java.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        LinkedHashSet<Integer> uniqueNumbers =
                new LinkedHashSet<>(numbers);

        ArrayList<Integer> result =
                new ArrayList<>(uniqueNumbers);

        System.out.println("After Removing Duplicates: " + result);
    }
}

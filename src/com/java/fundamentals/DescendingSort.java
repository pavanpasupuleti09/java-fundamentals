package com.java.fundamentals;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(23);
        numbers.add(67);
        numbers.add(10);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers, (a, b) -> b.compareTo(a));

        System.out.println("Descending Order: " + numbers);
    }
}

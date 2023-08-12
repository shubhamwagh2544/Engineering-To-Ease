package com.engineering.algoexpert.easy;

import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int[] array = {-2, -1, 1, 2, 3, 5, 6, 8, 9};

        //should work for positive as well negative numbers
        getSortedSquaredArray1(array, array.length);
    }

    private static void getSortedSquaredArray1(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }

        int[] squaredArray = Arrays.stream(array)
                .map(number -> number * number)
                .sorted()
                //.forEach(System.out::println);
                .toArray();

        System.out.println(Arrays.toString(squaredArray));
    }
}

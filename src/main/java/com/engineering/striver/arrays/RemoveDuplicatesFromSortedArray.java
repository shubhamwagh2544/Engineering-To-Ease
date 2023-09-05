package com.engineering.striver.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        //int[] array = {1, 1, 2, 2, 2, 3, 3};
        int[] array = {1, 2};

        int n = array.length;

        //TC : O(n)
        //SC : O(n)
        brute(array, n);

        //TC : O(n)
        //SC : O(1)
        better(array, n);
    }

    private static void better(int[] array, int n) {
        int k = 1;
        int prev = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] != prev) {
                array[k++] = array[i];
                prev = array[i];
            }
        }

        System.out.println(k);
    }

    private static void brute(int[] array, int n) {
        Set<Integer> set = new HashSet<>();

        for (int element : array) {
            set.add(element);
        }

        System.out.println(set.size());
    }
}

package com.engineering.challenges.sorting;

import java.util.Arrays;

public class RecursiveInsertion {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1};
        int n = array.length;

        recursiveInsertion(array, 1, n);        //O(n2)

        System.out.println(Arrays.toString(array));
    }

    private static void recursiveInsertion(int[] array, int i, int n) {
        //base case
        if (i == n) return;

        int j = i;
        while (j > 0 && array[j] < array[j-1]) {
            int temp = array[j];
            array[j] = array[j-1];
            array[j-1] = temp;

            j--;
        }

        recursiveInsertion(array, i+1, n);
    }
}

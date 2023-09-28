package com.engineering.striver.sorting;

import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1};
        int n = array.length-1;

        recursiveBubble(array, n);      //O(n2)

        System.out.println(Arrays.toString(array));
    }

    private static void recursiveBubble(int[] array, int n) {
        //base case
        if (n == 0) return;

        for (int i = 0; i <= n-1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }

        //recursion call
        recursiveBubble(array, n-1);
    }
}

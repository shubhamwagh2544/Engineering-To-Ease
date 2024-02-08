package com.engineering.challenges.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9, 11};
        int n = array.length;

        insertionSort(array, n);            //O(n2)
    }

    private static void insertionSort(int[] array, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j-1]) {        //Best Case : O(n)
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;

                j--;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

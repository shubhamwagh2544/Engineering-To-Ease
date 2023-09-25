package com.engineering.striver.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9, 11};
        int n = array.length;

        selectionSort(array, n);        //O(n2)
    }

    private static void selectionSort(int[] array, int n) {
        for (int i = 0; i <= n-2; i++) {
            int min = i;
            for (int j = i+1; j <= n-1; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}

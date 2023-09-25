package com.engineering.striver.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 1};
        int n = array.length;

        bubbleSort(array, n);           //O(n2)
    }

    private static void bubbleSort(int[] array, int n) {
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            if (!flag) break;                       //already sorted array
        }

        System.out.println(Arrays.toString(array));
    }
}

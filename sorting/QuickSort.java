package com.engineering.challenges.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1, 5};
        int n = array.length;

        quickSort(array, 0, n-1);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int ind = partitionArray(array, low, high);
            quickSort(array, low, ind-1);
            quickSort(array, ind+1, high);
        }
    }

    private static int partitionArray(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (array[i] <= pivot && i < high) {
                i++;
            }
            while (array[j] > pivot && j > low) {
                j--;
            }
            if (i < j) swap(array, i, j);
        }

        swap(array, low, j);
        return j;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

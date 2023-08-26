package com.engineering.striver.recursion;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 5, 7, 9, 1, 3};
        int low = 0;
        int high = array.length - 1;

        quickSort(array, low, high);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low > high) {
            return;
        }
        int partitionIndex = helperFunction(array, low, high);

        quickSort(array, low, partitionIndex-1);
        quickSort(array, partitionIndex+1, high);
    }

    private static int helperFunction(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low+1;
        int j = high;
        /*
        while (i <= j) {
            if (array[i] > pivot) {
                if (array[j] < pivot) {
                    swap(array, i, j);
                    i++;
                    j--;
                }
                else j--;
            }
            else i++;
        }
         */

        while (i < j) {
            while (array[i] <= pivot && i < high) {
                i++;
            }
            while (array[j] >= pivot && j > low) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
            }
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


package com.engineering.striver.recursion;

import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 5, 7, 9, 1, 3};
        int low = 0;
        int high = array.length - 1;

        //ascending
        //quickSortAsc(array, low, high);

        //descending
        quickSortDesc(array, low, high);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSortAsc(int[] array, int low, int high) {
        if (low > high) {
            return;
        }
        int partitionIndex = helperFunctionAsc(array, low, high);

        quickSortAsc(array, low, partitionIndex-1);
        quickSortAsc(array, partitionIndex+1, high);
    }

    private static int helperFunctionAsc(int[] array, int low, int high) {
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

    private static void quickSortDesc(int[] array, int low, int high) {
        if (low > high) {
            return;
        }
        int partitionIndex = helperFunctionDesc(array, low, high);

        quickSortDesc(array, low, partitionIndex-1);
        quickSortDesc(array, partitionIndex+1, high);
    }

    private static int helperFunctionDesc(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low+1;
        int j = high;

        while (i < j) {
            while (array[i] >= pivot && i < high) {
                i++;
            }
            while (array[j] <= pivot && j > low) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
            }
        }

        swap(array, low, j);
        return j;
    }
}


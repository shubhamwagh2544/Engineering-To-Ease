package com.engineering.challenges.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1, 5};
        int n = array.length;

        mergeSort(array, 0, n-1);

        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);

        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();

        int i = low;
        int j = mid+1;

        while (i <= mid && j <= high) {
            if (array[i] < array[j]) {
                list.add(array[i]);
                i++;
            }
            else {
                list.add(array[j]);
                j++;
            }
        }

        while (i <= mid) {
            list.add(array[i]);
            i++;
        }
        while (j <= high) {
            list.add(array[j]);
            j++;
        }

        int ind = 0;
        for (int k = low; k <= high; k++) {
            array[k] = list.get(ind++);
        }
    }
}

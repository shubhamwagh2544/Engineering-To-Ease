package com.engineering.striver.recursion;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4, 1, 5, 6, 2, 4};
        int low = 0;
        int high = array.length-1;

        //TC : O(NlogN)
        //SC : O(N)
        mergeSort(array, low, high);

        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);

        merge(array, low, mid, high);
    }

    private static void merge(int[] array, int low, int mid, int high) {
        List<Integer> list = new ArrayList<>();     //O(N)
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high) {
            if (array[left] <= array[right]) {
                list.add(array[left]);
                left++;
            }
            else {
                list.add(array[right]);
                right++;
            }
        }

        while (left <= mid)	{
            list.add(array[left]);
            left++;
        }

        while (right <= high) {
            list.add(array[right]);
            right++;
        }

        int index = 0;
        for (int i = low; i <= high; i++) {
            //array[i] = list.get(i-low);
            array[i] = list.get(index++);
        }
    }

}

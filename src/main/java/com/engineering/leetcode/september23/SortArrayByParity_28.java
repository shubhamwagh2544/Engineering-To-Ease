package com.engineering.leetcode.september23;

public class SortArrayByParity_28 {
    public static void main(String[] args) {
        int[]  array = {3, 1, 2, 4};
        int n = array.length;

        sortArrayByParity(array, n);
    }

    private static void sortArrayByParity(int[] array, int n) {
        int i = 0;
        int j = n-1;

        while (i < j) {
            while (i < n && array[i] % 2 == 0) i++;
            while (j > 0 && array[j] % 2 != 0) j--;
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}

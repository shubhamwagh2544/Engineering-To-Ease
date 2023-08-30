package com.engineering.striver.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 0, 5, 1, 3, 5};
        int n = array.length;

        largestElementInArray1(array, n);
        largestElementInArray2(array);
    }

    private static void largestElementInArray1(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    private static void largestElementInArray2(int[] array) {
        int max = -1;
        for (int element : array) {
            if (element >= max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}

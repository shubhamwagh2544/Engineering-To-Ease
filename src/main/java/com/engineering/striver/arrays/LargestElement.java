package com.engineering.striver.arrays;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 3, 0, 5, 1, 3, 5};
        int n = array.length;

        //brute
        //TC : O(NLogN)
        //SC : O(N) or O(logN)
        largestElement(array, n);

        //optimal
        //TC : O(N)
        largestElementInArray1(array, n);
        largestElementInArray2(array);
    }

    private static void largestElement(int[] array, int n) {
        Arrays.sort(array);
        System.out.println(array[n-1]);
    }

    private static void largestElementInArray1(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    private static void largestElementInArray2(int[] array) {
        int max = -1;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);
    }
}

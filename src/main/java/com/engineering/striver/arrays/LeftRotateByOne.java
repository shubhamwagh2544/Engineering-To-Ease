package com.engineering.striver.arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        //TC : O(n)
        //SC : O(1)
        leftRotateByOne(array, n);
    }

    private static void leftRotateByOne(int[] array, int n) {
        int first = array[0];
        for (int i = 1; i < n; i++) {
            array[i-1] = array[i];
        }
        array[n-1] = first;

        System.out.println(Arrays.toString(array));
    }
}

package com.engineering.challenges.arrays;

import java.util.Arrays;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        rightRotateByOne(array, n);
    }

    private static void rightRotateByOne(int[] array, int n) {
        int last = array[n - 1];
        for (int i = n-2; i >= 0; i--) {
            array[i+1] = array[i];
        }
        array[0] = last;

        System.out.println(Arrays.toString(array));
    }
}

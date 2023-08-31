package com.engineering.striver.arrays;

import java.util.Arrays;

public class RotateRightByK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        int k = 3;

        //TC : O(n + k)
        //SC : O(k)
        brute(array, n, k);

        //TC : O(n * k)
        //SC : O(1)
        better(array, n, k);

        //TC : O(n) + O(n) => O(n)
        //SC : O(1)
        optimal(array, n, k);
    }

    private static void optimal(int[] array, int n, int  k) {
        //if right rotation -> reverse(reverse(0, n-k-1), reverse(n-k, n-1)
        k = k % n;
        reverse(0, n-k-1, array);
        reverse(n-k, n-1, array);
        reverse(0, n-1, array);

        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int first, int last, int[] array) {
        while (first <= last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
    }

    private static void better(int[] array, int n, int k) {
        k = k % n;
        for (int i = 0; i < k; i++) {
            rotateRightByOne(array, n);
        }
        System.out.println(Arrays.toString(array));
    }

    private static void brute(int[] array, int n, int k) {
        k = k % n;
        int index = n-k;
        int[] temp = new int[k];

        int i = 0;
        while (index < n) {
            temp[i++] = array[index++];
        }

        index = n-k;
        while (index > 0) {
            array[index-1+k] = array[index-1];
            index--;
        }

        i = 0;
        while (i < k) {
            array[i] = temp[i];
            i++;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void rotateRightByOne(int[] array, int n) {
        int temp = array[n-1];
        for (int i = n-2; i >= 0; i--) {
            array[i+1] = array[i];
        }
        array[0] = temp;
    }
}

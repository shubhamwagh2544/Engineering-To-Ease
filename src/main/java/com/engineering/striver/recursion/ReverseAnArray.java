package com.engineering.striver.recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int start = 0;
        int end = array.length-1;   //can be optimized to one pointer

        //two pointer
        //reverseArrayUsingFunctionalRecursion1(start, end, array);

        //one pointer
        reverseArrayUsingFunctionalRecursion2(start, array, array.length);
    }

    private static void reverseArrayUsingFunctionalRecursion1(int start, int end, int[] array) {
        if (start > end) {
            System.out.println(Arrays.toString(array));
            return;
        }
        swapItems1(start, end, array);      // two pointer
        start = start+1;
        end = end-1;
        reverseArrayUsingFunctionalRecursion1(start, end, array);
    }

    private static void swapItems1(int start, int end, int[] array) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    private static void reverseArrayUsingFunctionalRecursion2(int i, int[] array, int n) {
        if (i >= n/2) {
            System.out.println(Arrays.toString(array));
            return;
        }
        swapItems2(i, n-i-1, array);        //optimized to one pointer
        reverseArrayUsingFunctionalRecursion2(i+1, array, n);
    }

    private static void swapItems2(int i, int n, int[] array) {
        int temp = array[i];
        array[i] = array[n];
        array[n] = temp;
    }

}

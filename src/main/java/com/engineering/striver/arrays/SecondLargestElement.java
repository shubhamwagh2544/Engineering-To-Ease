package com.engineering.striver.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 4, 7, 7, 7, 5, 6, 5};
        int n = array.length;

        //TC : O(NlogN)
        //SC : O(N) or O(logN)
        brute(array, n);          //no duplicates

        //TC : O(n) (which is O[n+n] => O[2n])
        //SC: O(1)
        better(array, n);         //no duplicates + here we modify the input array

        //TC : O(n) (which is O[n+n] => O[2n])
        //SC : O(1)
        better2(array);          // here we don't modify input array

        //TC : O(n) (single traversal)
        //SC : O(1)
        optimal(array, n);
    }

    private static void brute(int[] array, int n) {
        //only if no duplicates
        Arrays.sort(array);
        System.out.println(array[n-2]);
    }

    private static void better(int[] array, int n) {
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        array[maxIndex] = 0;

        int secondMax = 0;
        for (int element : array) {
            if (element > secondMax) {
                secondMax = element;
            }
        }

        System.out.println(secondMax);
    }

    private static void better2(int[] array) {
        int max = -1;
        int secondMax = -1;

        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }

        for (int element : array) {
            if (element > secondMax && element != max) {
                secondMax = element;
            }
        }

        System.out.println(secondMax);
    }

    private static void optimal(int[] array, int n) {
        int max = -1;
        int secondMax = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }

            if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        System.out.println(secondMax);
    }
}

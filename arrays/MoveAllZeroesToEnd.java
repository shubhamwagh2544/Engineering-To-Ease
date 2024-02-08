package com.engineering.challenges.arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] array = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int n = array.length;

        //TC : O(n)
        //SC : O(n)
        brute(array, n);

        //TC : O(n)
        //SC : O(1)
        better(array, n);
    }

    private static void better(int[] array, int n) {
        int index = 0;
        for (int element : array) {
            if (element != 0) {
                array[index++] = element;
            }
        }
        while (index < n) {
            array[index++] = 0;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void brute(int[] array, int n) {
        int[] temp = new int[n];
        int tempIndex = 0;

        for (int element : array) {
            if (element != 0) {
                temp[tempIndex++] = element;
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}

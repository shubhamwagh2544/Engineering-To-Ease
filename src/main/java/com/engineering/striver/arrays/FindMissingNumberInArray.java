package com.engineering.striver.arrays;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] array= {1, 2, 4, 5};
        int n = array.length;

        //TC : O(n)
        brute(array, n);
    }

    private static void brute(int[]array, int n) {
        int max = 0;
        int min = 1;
        int sum = 0;

        for (int element : array) {
            max = Math.max(max, element);
            min = Math.min(min, element);
            sum += element;
        }

        int totalSum = 0;

        while (min <= max) {
            totalSum += min;
            min++;
        }

        if (totalSum > sum) {
            System.out.println(totalSum - sum);
        }
        else {
            System.out.println(max+1);
        }
    }
}

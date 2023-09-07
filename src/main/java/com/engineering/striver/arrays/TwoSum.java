package com.engineering.striver.arrays;

public class TwoSum {
    public static void main(String[] args) {
        //int[] array = {2, 7, 11, 15};
        int[] array = {3, 2 ,4};
        int n = array.length;
        int target = 6;

        //TC : O(n^2)
        //SC : O(1)
        brute(array, n, target);
    }

    private static void bruteAnother(int[] array, int n, int target) {

    }

    private static void brute(int[] array, int n, int target) {
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i]+array[j] == target) {
                    System.out.println(array[i] + " " + array[j]);
                    return;
                }
            }
        }
    }
}

package com.engineering.challenges.arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        int n = array.length;

        //TC : O(N)
        //SC : O(1)
        optimal(array, n);
    }

    private static void optimal(int[] array, int n) {
        int max = 0;
        int count = 0;

        for (int element : array) {
            if (element == 1) {
                count++;
                max = Math.max(count, max);
            }
            else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}

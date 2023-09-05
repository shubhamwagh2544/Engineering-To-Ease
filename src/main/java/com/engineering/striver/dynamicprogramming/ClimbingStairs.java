package com.engineering.striver.dynamicprogramming;

import com.engineering.striver.recursion.ScannerProvider;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();
        int[] array = new int[n+1];

        for (int i = 0; i <= n; i++) {
            array[i] = i;
        }

        //TC: O(2^n)
        //SC : O(n)
        int ans = climb(n);
        System.out.println(ans);

        //TC : O(n)
        //SC : O(n)
        int[] climbingArray = new int[n+1];
        int ans1 = climbBetter(n, climbingArray);
        System.out.println(ans1);

        //TC : O(n)
        //SC : O(1)
        int ans2 = climbBest(n);
        System.out.println(ans2);
    }

    private static int climbBest(int n) {
        if (n == 0 || n == 1) return 1;

        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    private static int climbBetter(int n, int[] climbingArray) {
        if (n == 0 || n == 1) return 1;
        if (climbingArray[n] != 0) return climbingArray[n];

        return climbingArray[n] = climbBetter(n-1, climbingArray) + climbBetter(n-2, climbingArray);
    }

    private static int climb(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int left = climb(n-1);
        int right = climb(n-2);

        return left + right;
    }
}

package com.engineering.striver.recursion;

import java.util.Arrays;

public class CombinationSum4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int target = 4;

        //recursion
        System.out.println(combinationSumRecursive(array, target));

        //dynamic programming
        System.out.println(combinationSumDPWay(array, target));
    }

    private static int combinationSumRecursive(int[] array, int target) {
        if (target == 0) {
            return 1;
        }

        int res = 0;
        for (int element : array) {
            if (element <= target) {
                res += combinationSumRecursive(array, target - element);
            }
        }

        return res;
    }

    private static int combinationSumDPWay(int[] array, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);

        dp[0] = 1;      //base case

        return helper(array, dp, target);
    }

    private static int helper(int[] array, int[] dp, int target) {
        if (dp[target] != -1) return dp[target];

        int res = 0;
        for (int element : array) {
            if (element <= target) {
                res += helper(array, dp, target - element);
            }
        }

        dp[target] = res;
        return dp[target];
    }
}

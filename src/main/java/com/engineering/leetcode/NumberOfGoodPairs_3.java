package com.engineering.leetcode;

public class NumberOfGoodPairs_3 {        //pair (i, j) is called good if arr[i] == arr[j] and i < j
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 1, 1, 3};
        int[] nums = {1, 1, 1, 1};
        int n = nums.length;

        //TC : O(n2)
        //brute(nums, n);

        optimal(nums, n);
    }

    private static void optimal(int[] nums, int n) {
        //constraint : 1 <= nums[i] <= 100
        int[] space = new int[101];
        int res = 0;

        for (int el : nums) {
            res += space[el];
            space[el] += 1;
        }

        System.out.println(res);
    }

    private static void brute(int[] nums, int n) {
        int cnt = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
        }


        System.out.println(cnt);
    }
}

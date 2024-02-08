package com.engineering.challenges.binarysearch;

public class SearchInRotatedSorted {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target = 1;

        //TC : O(n)
        //SC : O(1)
        brute(nums, nums.length, target);

        optimal(nums, nums.length, target);
    }

    private static void optimal(int[] nums, int length, int target) {

    }

    private static void brute(int[] nums, int length, int target) {
        //linear search
        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                System.out.println("Found at index : " + i);
                return;
            }
        }
    }
}

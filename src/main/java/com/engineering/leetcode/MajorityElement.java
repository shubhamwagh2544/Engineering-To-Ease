package com.engineering.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {          //element that appears more than n/2 times
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        //TC : o(n2)
        //SC : o(1)
        brute(nums, nums.length);

        //TC : O(n)
        //SC : O(n)
        better(nums, nums.length);

        //TC : O(NLogN)
        //SC : O(1)
        betterAnother(nums, nums.length);

        //Moore's Voting Algorithm
        //TC : O(n)
        //SC : o(1)
        optimal(nums, nums.length);
    }

    private static void optimal(int[] nums, int length) {
        //Moore's Voting Algorithm

        int cnt = 0;
        int el = 0;

        for (int i = 0; i < length; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            }
            else if (el == nums[i]) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        //if stated that: not necessarily majority element is present always
        //we can check
        cnt = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == el) cnt++;
        }

        if (cnt > length / 2) System.out.println(el);
        else System.out.println(-1);

    }

    private static void betterAnother(int[] nums, int length) {
        //after sorting, number that appears more than n/2 times, will appear in middle
        // i.e. n/2 position

        Arrays.sort(nums);
        System.out.println(nums[length / 2]);
    }

    private static void better(int[] nums, int length) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int el : nums) {
            if (hashMap.containsKey(el)) hashMap.put(el, hashMap.get(el) + 1);
            else hashMap.put(el, 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > length / 2) {
                System.out.println(entry.getKey());
                return;
            }
        }
    }

    private static void brute(int[] nums, int length) {
        for (int i = 0; i < length; i++) {
            int cnt = 1;
            for (int j = 0; j < length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if (cnt > length / 2) {
                System.out.println(nums[i]);
                return;
            }
        }
    }
}

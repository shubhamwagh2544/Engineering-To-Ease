package com.engineering.leetcode.october23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
        Majority Element : element that appears more than n/3 times

        array will have 2 majority elements at max
        n = 5
        n/3 = 1
        so elements frequency _greater than 1_ will be majority element i.e. at max elements will be having frequency 2
        so 2 + 2 + 1 = 5
        at max 2 elements will be in array which are majority elements
 */
public class MajorityElementII_5 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2};

        //TC : O(n2)
        //SC : O(1)
        brute(nums, nums.length);

        //TC : O(n)
        //SC : O(n) where n is hashmap size
        better(nums, nums.length);

        //TC : O(n)
        //SC : O(1)
        optimal(nums, nums.length);
    }
    private static void optimal(int[] nums, int length) {
        //Moore's Voting Algorithm
        List<Integer> list = new ArrayList<>();

        int cnt1 = 0, cnt2 = 0;
        int el1 = 0, el2 = 0;

        for (int i = 0; i < length; i++) {
            if (cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            }
            else if (cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            }
            else if (nums[i] == el1) {
                cnt1++;
            }
            else if (nums[i] == el2) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        //verification
        cnt1 = 0;
        cnt2 = 0;
        int i = 0;

        while (i < length) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
            i++;
        }

        if (cnt1 > length/3) list.add(el1);
        if (cnt2 > length/3) list.add(el2);

        System.out.println(list);
    }

    private static void better(int[] nums, int length) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();        //O(n)

        for (int el : nums) {       //O(n)
            if (hashMap.containsKey(el)) hashMap.put(el, hashMap.get(el) + 1);
            else hashMap.put(el, 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {      //O(n)
            if (entry.getValue() > length/3) {
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }

    private static void brute(int[] nums, int length) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            int cnt = 1;
            for (int j = 0; j < length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if (cnt > length/3) {
                if (list.size() != 2 && !list.contains(nums[i])) list.add(nums[i]);
            }
        }

        System.out.println(list);
    }
}

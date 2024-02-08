package com.engineering.challenges.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 7};
        int n = array.length;

        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(0, target, ans, array, n, new ArrayList<>());

        System.out.println(ans);
    }

    private static void combinationSum(int index, int target, List<List<Integer>> ans, int[] array, int n, List<Integer> list) {
        //TC : O(2^T * K) where T is target and K is list size we add to ans.
        //We select each element till we reach index==n or target==0
        if (index == n) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));     //adding list of target sum as separate list => O(K) where K is longest length of list
            }
            return;
        }

        if (array[index] <= target) {
            list.add(array[index]);
            combinationSum(index, target-array[index], ans, array, n, list);
            list.remove(list.size()-1);
        }
        combinationSum(index+1, target, ans, array, n, list);
    }

}
package com.engineering.striver.recursion;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2};
        int n = array.length;

        int target = 4;
        Set<List<Integer>> ans = new LinkedHashSet<>();
        combinationSum(0, target, ans, array, n, new ArrayList<>());

        System.out.println(ans);
    }

    private static void combinationSum(int index, int target, Set<List<Integer>> ans, int[] array, int n, List<Integer> list) {
        if (index == n) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (array[index] <= target) {
            list.add(array[index]);
            combinationSum(index+1, target-array[index], ans, array, n, list);
            list.remove(list.size()-1);
        }
        combinationSum(index+1, target, ans, array, n, list);
    }

}
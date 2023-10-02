package com.engineering.challenges.recursion;

import java.util.*;

public class CombinationSum2 {
    public static void main(String[] args) {
        //int[] array = {1, 1, 1, 2, 2};
        int[] array = {2, 1, 1, 2, 1};
        int n = array.length;

        //what if sort the array beforehand -> we do not need LinkedHashSet
        Arrays.sort(array);

        int target = 4;
        //Set<List<Integer>> ans = new LinkedHashSet<>();
        Set<List<Integer>> ans = new HashSet<>();
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
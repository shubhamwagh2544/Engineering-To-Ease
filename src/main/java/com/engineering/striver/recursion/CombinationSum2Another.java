package com.engineering.striver.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2Another {
    public static void main(String[] args) {
        int[] array = {2, 1, 1, 2, 1};
        int n = array.length;
        int target = 4;

        //sort the array
        Arrays.sort(array);

        List<List<Integer>> ans = new ArrayList<>();
        combinationSum2(0, array, n, target, ans, new ArrayList<>());
        System.out.println(ans);
    }

    private static void combinationSum2(int index, int[] array, int n, int target, List<List<Integer>> ans, List<Integer> list) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < n; i++) {
            if (i > index && array[i] == array[i-1]) {
                continue;
            }
            //if array[i] exceeding target, anything to right can't be picked up [since array is sorted]
            if (array[i] > target) {
                break;
            }

            list.add(array[i]);
            combinationSum2(i+1, array, n, target-array[i], ans, list);
            list.remove(list.size()-1);
        }
    }
}

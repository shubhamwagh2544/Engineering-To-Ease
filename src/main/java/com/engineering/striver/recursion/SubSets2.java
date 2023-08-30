package com.engineering.striver.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3};
        int n = array.length;

        //sort the array => to remove duplicates
        Arrays.sort(array);

        List<List<Integer>> ans = new ArrayList<>();
        subsetSum2(0, array, n, ans , new ArrayList<>());

        System.out.println(ans);
    }

    private static void subsetSum2(int index, int[] array, int n, List<List<Integer>> ans, List<Integer> list) {
        //no base case since we want all combinations of subsets
        ans.add(new ArrayList<>(list));

        //pick up and not pick up
        for (int i = index; i < n; i++) {                       // loop will end all recursions at n-1 (no base case)
            if (i != index && array[i] == array[i-1]) {
                continue;
            }

            list.add(array[i]);
            subsetSum2(i+1, array, n, ans, list);

            list.remove(list.size()-1);
        }
    }
}

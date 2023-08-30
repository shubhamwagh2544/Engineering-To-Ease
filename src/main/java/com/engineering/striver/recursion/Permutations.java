package com.engineering.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int n = array.length;

        List<List<Integer>> ans = new ArrayList<>();
        boolean[] markedOrNot = new boolean[n];

        permutations(array, n, ans, markedOrNot, new ArrayList<>());

        System.out.println(ans);
    }

    private static void permutations(int[] array, int n, List<List<Integer>> ans, boolean[] markedOrNot, List<Integer> list) {
        //base case
        if (list.size() == n) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!markedOrNot[i]) {
                list.add(array[i]);
                markedOrNot[i] = true;
                permutations(array, n, ans, markedOrNot, list);
                list.remove(list.size()-1);
                markedOrNot[i] = false;
            }
        }

    }
}

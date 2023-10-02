package com.engineering.challenges.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int n = array.length;

        List<List<Integer>> ans = new ArrayList<>();
        permutations2(0, array, n, ans);

        System.out.println(ans);
    }

    private static void permutations2(int index, int[] array, int n, List<List<Integer>> ans) {
        //base case
        if (index == n) {
            //copy array elements into list => add list to ans
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(array[i]);
            }

            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < n; i++) {
            swap(i, index, array);
            permutations2(index+1, array, n, ans);
            swap(i, index, array);
        }
    }

    private static void swap(int i, int index, int[] array) {
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
}

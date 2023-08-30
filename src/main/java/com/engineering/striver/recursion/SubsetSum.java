package com.engineering.striver.recursion;

import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] array = {3, 1, 4};
        int n = array.length;

        List<Integer> list = new ArrayList<>();
        subsetSum(0, 0, array, n, list);

        //to get sorted sum
        Collections.sort(list);

        System.out.println(list);
    }

    private static void subsetSum(int index, int sum, int[] array, int n, List<Integer> list) {
        if (index == n) {
            list.add(sum);
            return;
        }
        //pick up
        subsetSum(index+1, sum+array[index], array, n, list);
        //no pick up
        subsetSum(index+1, sum, array, n, list);
    }
}

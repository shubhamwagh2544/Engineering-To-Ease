package com.engineering.algoexpert.easy;

import java.util.*;

public class NonConstructibleChange {
    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};

        findMinimumNonConstrutibleChange(coins, coins.length);
    }

    private static void findMinimumNonConstrutibleChange(int[] coins, int length) {
        //bitmask approach

        Set<Integer> set = new TreeSet<>();
        for (int mask = 0; mask < (1 << length); mask++) {
            int currentSum = 0;
            for (int i = 0; i < length; i++) {
                if ((mask & (1 << i)) != 0) {
                    currentSum += coins[i];
                }
            }
            set.add(currentSum);
        }

        List<Integer> list = set.stream().toList();
        boolean flag = false;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i+1) - list.get(i) != 1) {
                System.out.println(list.get(i)+1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(list.get(list.size()-1)+1);
        }
    }
}

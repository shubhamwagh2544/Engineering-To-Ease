package com.engineering.leetcode.september23;

import com.engineering.striver.recursion.ScannerProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int num = ScannerProvider.scanner().nextInt();
        List<List<Integer>> ans = new ArrayList<>();

        //brute(num, ans);

        //optimal(num, ans);

        recursiveWay(num, ans);
        ans.forEach(list -> System.out.println(list));
    }

    private static void recursiveWay(int num, List<List<Integer>> ans) {
        if (num == 1) {
            ans.add(Arrays.asList(1));
            return;
        }

        recursiveWay(num-1, ans);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(1);
        }

        for (int i = 1; i < num-1; i++) {
            list.set(i, ans.get(num-2).get(i) + ans.get(num-2).get(i-1));
        }

        ans.add(list);
    }

    private static void optimal(int num, List<List<Integer>> ans) {
        ans.add(List.of(1));

        for (int i = 1; i < num; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                int n = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                list.add(n);
            }
            list.add(1);
            ans.add(new ArrayList<>(list));
        }

        ans.forEach(list -> System.out.println(list));
    }

    private static void brute(int num, List<List<Integer>> ans) {
        ans.add(List.of(1));
        int count = 2;
        List<Integer> prevList = null;

        while (count <= num) {
            List<Integer> list = new ArrayList<>();
            int ind = 1;
            int i = 0;

            while (ind <= count) {
                if (ind == 1) {
                    list.add(1);
                }
                else if (ind == count) {
                    list.add(1);
                    ans.add(new ArrayList<>(list));
                }
                else {
                    list.add(getNumberFromList(prevList, i));
                    i++;
                }
                ind++;
            }
            prevList = list;
            count++;
        }
    }

    private static Integer getNumberFromList(List<Integer> list, int i) {
        return list.get(i) + list.get(i+1);
    }
}

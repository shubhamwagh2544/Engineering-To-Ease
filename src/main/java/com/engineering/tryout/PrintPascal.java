package com.engineering.tryout;

import com.engineering.striver.recursion.ScannerProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPascal {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        matrixWay(n);

        listWay(n);
    }

    private static void matrixWay(int n) {
        int[][] ans = new int[n][n];

        //fill with 1
        for (int i = 0; i < n; i++) {
            Arrays.fill(ans[i], 1);
        }

        System.out.println(1);              //ans[0][0]

        for (int i = 1; i < n; i++) {
            //System.out.print(1);            //ans[i][0]
            System.out.print(ans[i][0] + " ");
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
                System.out.print(ans[i][j] + " ");
            }
            //System.out.println(1);          //ans[i][i]
            System.out.println(ans[i][i]);
        }
    }

    private static void listWay(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));

        for (int i = 1; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 1; j < i; j++) {
                int num = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                list.add(num);
            }
            list.add(1);
            ans.add(new ArrayList<>(list));
        }

        ans.forEach(list -> System.out.println(list));
    }
}

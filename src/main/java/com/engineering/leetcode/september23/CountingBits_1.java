package com.engineering.leetcode.september23;

import com.engineering.striver.recursion.ScannerProvider;

import java.util.Arrays;

public class CountingBits_1 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //TC : O(NlogN)
        //SC : O(n)
        brute(n);

        //TC : O(NlogN)
        //SC : O(n)
        better(n);

        //TC : O(n)
        //SC : o(n)
        optimal(n);

        optimalAnother(n);
    }

    private static void optimalAnother(int n) {
        int[] ans = new int[n+1];
        if (n == 0) return;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans[i] = ans[i/2];
            }
            else {
                ans[i] = 1 + ans[i/2];
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    private static void optimal(int n) {
        int[] ans = new int[n+1];

        for (int i = 0; i <= n; i++) {
            ans[i] = dpWay(i);
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int dpWay(int n) {
        int[] dpArray = new int[n+1];
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (dpArray[n] != 0) return dpArray[n];

        if (n % 2 == 0) return dpArray[n] = dpWay(n/2);
        else return dpArray[n] = 1 + dpWay(n/2);
    }

    private static void better(int n) {
        int[] ans = new int[n+1];

        for (int i = 0; i <= n; i++) {
            ans[i] = recursion(i);
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int recursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (n % 2 == 0) return recursion(n/2);
        else return 1 + recursion(n/2);
    }

    private static void brute(int n) {
        int[] ans = new int[n +1];          //N

        for (int i = 0; i <= n; i++) {      //N
            ans[i] = numberOfOnes(i);
        }

        System.out.println(Arrays.toString(ans));
    }

    private static int numberOfOnes(int n) {
        int count = 0;
        for (int i = 0; i <= 31; i++) {     //logN
            if (((n >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}

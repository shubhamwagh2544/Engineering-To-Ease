package com.engineering.leetcode;

import com.engineering.tryout.ScannerProvider;

public class IntegerBreak_6 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        optimalUsingMathematics_1(n);

        optimalUsingMathematics_2(n);
    }

    private static void optimalUsingMathematics_2(int n) {
        //based on mathematical observation

        if (n <= 1) System.out.println(0);
        if (n <= 3) System.out.println(n-1);

        //3 cases
        if (n % 3 == 0) System.out.println((int) Math.pow(3, n/3));
        else if (n % 3 == 1) System.out.println((int) Math.pow(3, n/3-1) * 4);
        else System.out.println((int) Math.pow(3, n/3) * 2);
    }

    private static void optimalUsingMathematics_1(int n) {
        //based on mathematical observation

        if (n <= 1) System.out.println(0);
        if (n <= 3) System.out.println(n-1);

        int res = 1;
        while (n > 4) {
            res *= 3;
            n = n-3;
        }

        System.out.println(res*n);
    }
}

package com.engineering.challenges.recursion;

import com.engineering.tryout.ScannerProvider;

public class FactorialOfN {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();
        //parametrized recursion
        int result = 1;
        //printFactorialParametrizedWay1(n, result);
        //printFactorialParametrizedWay2(1, n, result);

        //functional recursion
        //System.out.println(returnFactorialFunctionalWay1(n));
        System.out.println(returnFactorialFunctionalWay2(1, n));
    }

    private static int returnFactorialFunctionalWay2(int i, int n) {
        if (i > n) {
            return 1;
        }
        return i * returnFactorialFunctionalWay2(i+1, n);
    }

    private static int returnFactorialFunctionalWay1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * returnFactorialFunctionalWay1(n-1);
    }

    private static void printFactorialParametrizedWay2(int i, int n, int result) {
        if (i > n) {
            System.out.println(result);
            return;
        }
        printFactorialParametrizedWay2(i+1, n, result*i);
    }

    private static void printFactorialParametrizedWay1(int n, int result) {
        if (n == 1) {
            System.out.println(result);
            return;
        }
        printFactorialParametrizedWay1(n-1, result*n);
    }
}

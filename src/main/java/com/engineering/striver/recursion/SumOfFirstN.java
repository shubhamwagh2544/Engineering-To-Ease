package com.engineering.striver.recursion;

public class SumOfFirstN {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //parametrized recursion
        int result = 0;
        //printSumParametrizedWay1(n, result);
        //printSumParametrizedWay2(1, n, result);

        //functional recursion
        //System.out.println(returnSumFunctionalWay1(n));
        System.out.println(returnSumFunctionalWay2(1, n));
    }

    private static int returnSumFunctionalWay2(int i, int n) {
        if (i > n) {
            return 0;
        }
        return i + returnSumFunctionalWay2(i+1, n);
    }

    private static void printSumParametrizedWay2(int i, int n, int result) {
        if (i > n) {
            System.out.println(result);
            return;
        }
        printSumParametrizedWay2(i+1, n, result+i);
    }

    private static void printSumParametrizedWay1(int n, int result) {
        if (n < 1) {
            System.out.println(result);
            return;
        }
        result = result + n;
        printSumParametrizedWay1(n-1, result);
    }

    private static int returnSumFunctionalWay1(int n) {
        //[f(n) = n + f(n-1)] till n > 1
        if (n < 1) {
            return 0;
        }
        return n + returnSumFunctionalWay1(n-1);
    }
}

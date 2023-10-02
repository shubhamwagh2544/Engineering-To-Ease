package com.engineering.challenges.dynamicprogramming;

import com.engineering.challenges.recursion.ScannerProvider;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //Using Recursion
        //TC : O(2^n) since each F(n) calls F(n-1) and F(n-2)
        //SC : O(n)
        int res = recursiveWay(n);
        System.out.println(res);

        //Using Dynamic Programming : Memoization
        //TC : O(n)
        //SC : O(n) + O(n)
        int[] dpArray = new int[n+1];
        int ans = dynamicProgrammingWay(n, dpArray);
        System.out.println(ans);

        //Tabulation Way
        //TC : O(n)
        //SC : O(n)
        int fib = dynamicProgrammingWayUsingTabulation(n, dpArray);
        System.out.println(fib);

        //Space Optimization
        //TC : O(n)
        //SC : O(1)
        int fibonacci = spaceOptimization(n);
        System.out.println(fibonacci);

    }

    private static int spaceOptimization(int n) {
        int first = 0;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    private static int dynamicProgrammingWayUsingTabulation(int n, int[] dpArray) {
        dpArray[0] = 0;
        dpArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            dpArray[i] = dpArray[i-1] + dpArray[i-2];
        }

        return dpArray[dpArray.length-1];
    }

    private static int dynamicProgrammingWay(int n, int[] dpArray) {
        if (n == 0 || n == 1) {
            return n;
        }
        //if sub-problem is solved, return it
        if (dpArray[n] != 0) return dpArray[n];

        //storing the sub-problems
        return dpArray[n] = dynamicProgrammingWay(n-1, dpArray) + dynamicProgrammingWay(n-2, dpArray);
    }

    private static int recursiveWay(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return recursiveWay(n-1) + recursiveWay(n-2);
    }
}

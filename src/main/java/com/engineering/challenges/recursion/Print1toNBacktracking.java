package com.engineering.challenges.recursion;

import com.engineering.tryout.ScannerProvider;

public class Print1toNBacktracking {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();
        //n=3
        print1toNBacktracking(3, n);
    }

    private static void print1toNBacktracking(int i, int n) {
        if (i < 1) {
            return;
        }
        print1toNBacktracking(i-1, n);
        System.out.print(i+" ");
    }
}
/*
        Backtracking tree/stack :
        f(3, 3) -> 3
        f(2, 3) -> 2
        f(1, 3) -> 1
        f(0, 3) -> exit (base condition)
 */

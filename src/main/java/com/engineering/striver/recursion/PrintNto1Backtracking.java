package com.engineering.striver.recursion;

public class PrintNto1Backtracking {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();
        //n=3
        printNto1Backtracking(n, 1);
    }

    private static void printNto1Backtracking(int n, int i) {
        if (i > n) {
            return;
        }
        printNto1Backtracking(n, i+1);
        System.out.print(i+" ");
    }
}

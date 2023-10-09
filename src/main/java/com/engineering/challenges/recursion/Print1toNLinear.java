package com.engineering.challenges.recursion;

import com.engineering.tryout.ScannerProvider;

public class Print1toNLinear {
    public static void main(String[] args) {
        int N = ScannerProvider.scanner().nextInt();
        print1ToNLinear(1, N);
    }

    private static void print1ToNLinear(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        print1ToNLinear(i+1, n);
    }
}

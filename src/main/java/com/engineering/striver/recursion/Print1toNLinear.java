package com.engineering.striver.recursion;

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

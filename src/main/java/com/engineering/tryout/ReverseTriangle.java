package com.engineering.tryout;

public class ReverseTriangle {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        printReverse(n);
    }

    private static void printReverse(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

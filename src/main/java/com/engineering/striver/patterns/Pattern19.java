package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                5
                4 5
                3 4 5
                2 3 4 5
                1 2 3 4 5
 */
public class Pattern19 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-i; j <= n; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
 */
public class Pattern12 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        int start;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }

            System.out.println();
        }
    }
}

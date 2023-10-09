package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                E
                D E
                C D E
                B C D E
                A B C D E
 */
public class Pattern20 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            for (char ch = (char)('E'- i); ch <= 'E'; ch++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
}

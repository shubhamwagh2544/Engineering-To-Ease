package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
            A
            A B
            A B C
            A B C D
            A B C D E
 */
public class Pattern15 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < ('A'+i); ch++) {
                System.out.print(ch+ " ");
            }

            System.out.println();
        }
    }
}

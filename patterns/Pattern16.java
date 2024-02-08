package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
                A B C D E
                A B C D
                A B C
                A B
                A
 */
public class Pattern16 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch  < ('A'+i); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        System.out.println("--------------------------------------");

        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= ('A'+n-i); ch++) {
                System.out.print(ch+ " ");
            }

            System.out.println();
        }
    }
}

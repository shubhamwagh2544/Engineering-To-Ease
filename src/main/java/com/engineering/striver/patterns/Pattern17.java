package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
            A
            B B
            C C C
            D D D D
            E E E E E
 */
public class Pattern17 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A'+i);

            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}

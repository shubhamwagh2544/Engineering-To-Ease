package com.engineering.striver.patterns;

import com.engineering.striver.recursion.ScannerProvider;

/*
                    5 5 5 5 5 5 5 5 5
                    5 4 4 4 4 4 4 4 5
                    5 4 3 3 3 3 3 4 5
                    5 4 3 2 2 2 3 4 5
                    5 4 3 2 1 2 3 4 5
                    5 4 3 2 2 2 3 4 5
                    5 4 3 3 3 3 3 4 5
                    5 4 4 4 4 4 4 4 5
                    5 5 5 5 5 5 5 5 5
 */
public class Pattern27 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top = i;
                int left = j;
                int right = (2*n-1)-1-j;
                int bottom = (2*n-1)-1-i;

                int num = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n-num);
            }

            System.out.println();
        }
    }
}

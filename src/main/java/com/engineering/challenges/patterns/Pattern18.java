package com.engineering.challenges.patterns;

import com.engineering.tryout.ScannerProvider;

/*
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
*/
public class Pattern18 {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            //characters
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(ch);

                if (j < breakpoint) ch++;
                else ch--;
            }

            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

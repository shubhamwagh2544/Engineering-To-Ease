package com.engineering.tryout;

import com.engineering.striver.recursion.ScannerProvider;

public class PrintPrimesTillN {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //TC : O(n ^ 2)
        //SC : O(1)
        brute(n);

        //TC : O(n ^ 3/2)
        better(n);

        //TC : O(n * log(logn))
        //SC : O(1)
        optimal(n);
    }

    private static void optimal(int n) {


    }

    private static void better(int n) {

    }

    private static void brute(int n) {
        for (int i = 2; i <= n; i++) {
            if (ifPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean ifPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

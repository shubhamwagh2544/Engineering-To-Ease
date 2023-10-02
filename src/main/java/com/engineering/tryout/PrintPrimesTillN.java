package com.engineering.tryout;

import com.engineering.challenges.recursion.ScannerProvider;

public class PrintPrimesTillN {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //TC : O(n ^ 2)
        //SC : O(1)
        brute(n);

        //TC : O(n) + O(n ^ 1/2) => O(n ^ 3/2)
        better(n);

        //TC : O(n * log(logN))
        //SC : O(1)
        optimal(n);
    }

    private static void optimal(int n) {
        //Sieve of Eratosthenes
        boolean[] sieve = new boolean[n+1];

        for (int i = 2; i <= n; i++) {
            for (int j = i*i; j <= n; j+=i) {
                if (!sieve[j]) {
                    sieve[j] = true;
                }
            }
        }

        //printing primes
        for (int i = 2; i < sieve.length; i++) {
            if (!sieve[i]) {
                System.out.print(i+ " ");
            }
        }
    }

    private static void better(int n) {
        for (int i = 2; i <= n; i++) {          //O(n)
            if (isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) return false;

        if (n == 2 || n == 3) return true;

        if ((n % 2 == 0) || (n % 3 == 0)) return false;

        for (int i = 5; i * i <= n; i = i + 6) {        //O(sqrt of n)
            if (n % i == 0) return false;
        }

        return true;
    }

    private static void brute(int n) {
        for (int i = 2; i <= n; i++) {              //O(n)
            if (ifPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean ifPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {       //O(sqrt of N)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package com.engineering.challenges.maths;

import com.engineering.challenges.recursion.ScannerProvider;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        isArmStrong(n);
    }

    private static void isArmStrong(int n) {
        int cubeSum = 0;
        int dummy = n;

        while (n != 0) {
            int rem = n % 10;
            cubeSum += rem * rem * rem;
            n = n / 10;
        }

        if (cubeSum == dummy) System.out.println("ArmStrong");
        else System.out.println("Not");
    }
}

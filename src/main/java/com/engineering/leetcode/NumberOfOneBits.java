package com.engineering.leetcode;

import com.engineering.tryout.ScannerProvider;

public class NumberOfOneBits {
    //efficient
    static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    static int calculateOneBit(int n) {
        String str = Integer.toBinaryString(n);

        int cnt = 0;
        for (char c: str.toCharArray()) {
            if (c == '1') cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //brute
        System.out.println(calculateOneBit(n));

        //efficient
        System.out.println(hammingWeight(n));
    }
}

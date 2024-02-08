package com.engineering.tryout;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        //simple
        decimalToBinary(n);

        //bit manipulation
        decimalToBinaryAnother(n);
    }

    private static void decimalToBinaryAnother(int n) {
        StringBuilder binary = new StringBuilder();

        while (n != 0) {
            int bit = n & 1;
            binary.append(bit);
            n = n >> 1;
        }

        System.out.println(binary.reverse());
    }

    private static void decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();

        while (n != 0) {
            int remainder = n % 2;
            binary.append(remainder);
            n = n / 2;
        }

        System.out.println(binary.reverse());
    }
}

package com.engineering.challenges.recursion;

import java.util.Scanner;

public class ScannerProvider {
    private ScannerProvider() {
        throw new IllegalStateException("Utility Class");
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}

package com.engineering.challenges.gametheory;

import com.engineering.challenges.recursion.ScannerProvider;

/*
Two players Alice and Bob are playing a game. They have a pile with n coins in it.
They can pick either 1 or 2 coins in one turn. Alice goes first and they take alternate turns.
The player who picks the last coin is the winner. Can you find out the winner ?

Solution:
n == 1 : Alice
n == 2 : Alice
n == 3 : Bob
n == 4 : Alice
n == 5 : Alice
n == 6 : Bob

Hence, it's clear that for multiples of 3 bob wins, else Alice wins.
 */
public class OneTwoThreeGame {
    public static void main(String[] args) {        //constraint : 1 <= n <= 10^18
        long n = ScannerProvider.scanner().nextLong();

        if (n % 3 == 0) System.out.println("Bob");
        else System.out.println("Alice");
    }
}

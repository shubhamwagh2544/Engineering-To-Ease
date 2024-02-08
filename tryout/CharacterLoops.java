package com.engineering.tryout;

public class CharacterLoops {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'A' + 25; ch++) {     //26 characters
            System.out.print(ch+ " ");
        }

        System.out.println("\n------------------------------");

        char ch = 'A';
        while (ch != 'Z'+1) {
            System.out.print(ch++ + " ");
        }
    }
}

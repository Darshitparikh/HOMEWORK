package com.homework.week3;

public class ForLoopOddAndEvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int a = 1; a <= 20; a++) {
            if (a % 2 == 1) {
                System.out.println(a);
            }
        }
    }
}


package com.homework.week3;

public class DoWhileLoopOddAndEvenNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b;
        do {
            b = a % 2;
            if (b == 0) {
                System.out.println("   "+a+"  ");
            }
            else{
                System.out.println(a);
                 }
            a++;
        } while (a<=21);}
}

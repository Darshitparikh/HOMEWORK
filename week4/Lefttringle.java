package com.homework.week4;

public class Lefttringle {
    void stars()
    {for (int a = 1; a <= 5; a++) // for row
    {for (int b = 1; b <= 5-a; b++)  // for column
    { System.out.print("  ");} // for print space
        for (int c = 1; c<=a; c++) // for print *
        {System.out.print("* ");}
        System.out.println();}//  for separate line
    }
    public static void main(String[] args) {
        Lefttringle method3 = new Lefttringle();
        method3.stars();
    }
}

package com.homework.week4;

public class Tringle
{
void stars()
{for (int a = 1; a <= 5; a++) // for row
{for (int b = 1; b <= 5-a; b++)  // for space
{ System.out.print(" ");} // for print space
    for (int c = 1; c<=a; c++) //  for  column
    {System.out.print("* ");}
    System.out.println();}//  for separate line
}
public static void main(String[] args)
        {Tringle method2 = new Tringle();
           method2.stars();

}}
//public static void main(String[] args)
//    {StarPattern method1 = new StarPattern();
//        method1.Righttringle();
//        System.out.println("___________");


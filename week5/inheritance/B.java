package com.homework.week5.inheritance;

public class B extends A {

    public static void main(String[] args) {
        B obj = new B();
        obj.father();
    }
    public void child1(){
        System.out.println("this is child 1");
    }
}

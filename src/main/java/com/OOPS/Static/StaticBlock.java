package com.OOPS.Static;

public class StaticBlock {
    static int a=10;// initializing the value of  variable a
    static int b;//declaring a variable

    static {
        System.out.println("Hello I am in static Block");
        b=a*5;
    }

    public static void main(String[] args) {
       // StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}

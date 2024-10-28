package com.OOPS.Static;

public class Main {
    public static void main(String[] args) {
       // fun(); /*Non Static is allowed inside a static but you
       /* cannot access it without referencing  their instances in a static context*/

        Main obj= new Main();//So here creating a reference to access it
        obj.fun();
        greeting();

    }

    void fun() {
        System.out.println("Hello fun");

    }



    static void greeting() {
        System.out.println("Hello world");

    }


}

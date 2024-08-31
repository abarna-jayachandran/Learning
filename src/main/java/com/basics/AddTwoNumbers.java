package com.basics;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        try{
            Scanner in= new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a= in.nextInt();
            System.out.println("Enter the value of b:");
            int b =in.nextInt();
            int c= a+b;
            System.out.println("The result is"+" "+c);

        }
        catch (Exception e){
            System.out.println("Input Mismatch Exception found");
        }

    }
}

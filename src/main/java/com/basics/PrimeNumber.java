package com.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            boolean isPrime = true;
            if(num>-1){
                for (int i = 2; i * i <= num; i++) {
                    if (num % 2 == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime == true) {
                    System.out.println("The number " + num + " "+"is prime number");
                } else {
                    System.out.println("The number " + num + " "+"is not prime number");
                }
            }
            else {
                System.out.println("The entered number"+num+" "+ "negative number");
            }

        }catch (Exception e){
           System.out.println("Input Mismatch Exception found");
        }
    }
}



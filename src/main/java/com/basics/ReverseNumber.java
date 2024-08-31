package com.basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            int ans = 0;
            while (num > 0) {
                int remainder = num % 10;
                num = num / 10;
                ans = ans * 10 + remainder;
            }
            System.out.println("The reversed num is:"+" "+ans);

        } catch (Exception e) {
            System.out.println("caught Exception" + e);
            e.printStackTrace();
        }


    }
}

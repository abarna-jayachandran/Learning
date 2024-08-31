package com.basics;

import java.util.Scanner;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        int count = 0;
        while (num > 0) {
            int remainder = num % 10;//12343 % 10 means remainder=3
            if (remainder == 3)
                count++;
            num = num / 10; //123/10=means 1234
        }
        System.out.println(count);

    }
}



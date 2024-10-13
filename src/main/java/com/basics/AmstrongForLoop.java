package com.basics;

import java.util.Scanner;

public class AmstrongForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            if (isAmstrongNum(i)) {
                System.out.print(i + " ");
            }
        }    }

    static boolean isAmstrongNum(int n) {
        int org = n;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;//(153%10=3)
            n = n / 10;//(153/10=15)
            sum = sum + remainder * remainder * remainder;
        }

        return sum == org;
    }
}

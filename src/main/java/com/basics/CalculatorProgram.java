package com.basics;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator:");
            char operator = in.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.println("Enter the value a:");
                System.out.println("Enter the value b:");
                int a = in.nextInt();
                int b = in.nextInt();
                if (operator == '+') {
                    ans = a + b;
                }
                if (operator == '-') {
                    ans = a - b;
                }
                if (operator == '*') {
                    ans = a * b;
                }
                if (operator == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }

                }
                if (operator == '%') {
                    ans = a % b;
                } else if (operator == 'x' || operator == 'X') {
                    break;
                }
            } else {
                System.out.println("Invalid operator!!");
            }
            System.out.println("The result is :" + ans);
        }
    }
}


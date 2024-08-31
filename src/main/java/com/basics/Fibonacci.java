package com.basics;

public class Fibonacci {
    public static void main(String[] args) {
        try {
            int n = 10, firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ", ");
                int nextTerm = secondTerm;
                secondTerm = firstTerm + secondTerm;
                firstTerm = nextTerm;
            }

        } catch (Exception e) {
            System.out.println("Exception found");
        }

    }
}

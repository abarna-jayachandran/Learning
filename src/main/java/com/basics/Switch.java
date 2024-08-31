package com.basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name:");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("The King of fruit");
                break;
            case "Apple":
                System.out.println("The red fruit");
                break;
            case "Orange":
                System.out.println("The Round fruit");
                break;
            case "Banana":
                System.out.println("The yellow fruit");
                break;
            case "default":
                System.out.println("Enter the valid fruit");
                break;
            default:
                System.out.println("Switched to default");
        }
    }
}

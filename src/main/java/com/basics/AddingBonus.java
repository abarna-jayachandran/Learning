package com.basics;

import java.util.Scanner;

public class AddingBonus {
    public static void main(String[] args) {
        try{
            Scanner input= new Scanner(System.in);
            System.out.println("Enter the salary amount:");
            int salary= input.nextInt();
            if(salary>20000){
                salary=salary+2000;
            }
            else{
                salary+=1000;
            }
            System.out.println("The result after adding bonus:"+" "+salary);

        } catch (Exception e) {
            System.out.println("Caught Exception");
        }


    }
}

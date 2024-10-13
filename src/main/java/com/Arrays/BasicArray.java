package com.Arrays;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        arr[0]=230;
        arr[1]=234;
        arr[2]=232;
        arr[3]=233;
        arr[4]=243;
        System.out.println(arr[3]);
        //input using for loop
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }



    }
}

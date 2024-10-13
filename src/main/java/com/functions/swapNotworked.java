package com.functions;

public class swapNotworked {
    public static void main(String[] args) {
        int a=10,b=20;
        swap(10,20);
        System.out.println("The swapped value of a and b is :"+a+" "+b );
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

    }

    //why it is not getting swapped ?
    //* Primitives like int ,short, byte,float,char ----> just pass the value
    //* object and stuffs ----> Passing value of the reference variable
}

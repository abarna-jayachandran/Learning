package com.String;

public class Comparison {
    public static void main(String[] args) {
        String a= "abi";
        String b = "abi";
        System.out.println(a==b);//true
        a="abarna";
        System.out.println(a==b);//false
        String c=b;
        System.out.println(b==c);//true
        String name1= "abi";
        String name2= new String("abi");
        System.out.println(name1==name2);//false
        String name3= new String("Kavin");
        String name4= new String("Kavin");
        System.out.println(name3==name4);//false
        System.out.println(name3.equals(name4));// true

    }
}

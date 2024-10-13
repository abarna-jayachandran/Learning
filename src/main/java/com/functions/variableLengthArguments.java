package com.functions;

import java.util.Arrays;

public class variableLengthArguments {
    public static void main(String[] args) {
        fun(2,3,4,5,778,534,3,335,7,5,6,3,2);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

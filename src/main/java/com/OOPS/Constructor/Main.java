package com.OOPS.Constructor;

public class Main {
    public static void main(String[] args) {
        Human abi= new Human(33,"abi",10000,true);
        Human sri= new Human(30,"sri",20000,false);
        System.out.println(abi.name);
        System.out.println(sri.age);
        System.out.println(Human.population);


    }
}

package com.OOPS.Abstract;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
        //this.age = age;
    }

    @Override
    void career() {
        System.out.println("Daughter Career is going to be a Coder");

    }

    @Override
    void partner() {
        System.out.println("My Partner name is Rajesh");


    }
}

package com.OOPS.Abstract;

public class Son extends Parent {

    public Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("Son Career is going to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("My Partner name is Abarna");

    }


}

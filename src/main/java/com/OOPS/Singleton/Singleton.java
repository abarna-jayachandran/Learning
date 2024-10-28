package com.OOPS.Singleton;

public class Singleton {

    private Singleton(){
        // we should not allow users to  call this constructor
        // why because whenever user calls a constructor can create a multiple object
        // so the of aim having one object
        // have to stop user creating an object by making the constructor as a private
        // cannot be called by anyone since it's a private
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }

        return instance;
    }

}

package com.functions;

public class StringNotChanged {
    public static void main(String[] args) {
        String name="Abarna";
        greet(name);
        System.out.println(name);

    }
    static void greet(String fName){
         fName="abi";// new object
    }
    /* The name will not get changed why because we ar not modifying the name
    we are creating the new object
    and the scope of fname is inside the greet method only
    moreover  we cannot modify string since it is a final class ue to security reasons*/
}

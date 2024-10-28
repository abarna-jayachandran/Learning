package com.OOPS.AccessControl;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //its deprecated //finalize basically get called when the garbage collection hits
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
    // toString basically gives the String representation
    @Override
    public String toString() {
        return super.toString();
    }
    // basically gives unique representation of an object via a number
    @Override
    public int hashCode() {
        //return super.hashCode();
        return num;
    }

    public static void main(String[] args) {
        ObjectDemo obj1= new ObjectDemo(34);
        ObjectDemo obj2= new ObjectDemo(34);
        System.out.println(obj1.hashCode());//every object hashcode is unique
        System.out.println(obj2.hashCode());

    }

}

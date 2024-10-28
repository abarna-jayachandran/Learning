package com.OOPS.Inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight=4;
    }
    BoxWeight(double length,double height,double width){
        super(length,height,width);// it says calls the parent class constructor
        //use to initialize values present in parent class
        this.weight=weight;

    }
}

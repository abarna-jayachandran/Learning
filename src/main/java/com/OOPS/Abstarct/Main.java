package com.OOPS.Abstarct;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        //Car car= new Car()();
        car.accelerate();
        car.start();
        car.stop();

        Media media = new Car();
        //media.stop();
    }
}

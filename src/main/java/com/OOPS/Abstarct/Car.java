package com.OOPS.Abstarct;

public class Car implements Engine, Brake,Media{
    @Override
    public void brake() {
        System.out.println("I brake like a normal car ");
    }

    @Override
    public void start() {
        System.out.println("I Start a engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I Stop a engine like a normal car ");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car ");
    }

    @Override
    public void startmusic() {

    }

    @Override
    public void stopmusic() {

    }
}

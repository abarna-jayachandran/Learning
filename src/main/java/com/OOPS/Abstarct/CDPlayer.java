package com.OOPS.Abstarct;

public class CDPlayer implements Media{


    @Override
    public void startmusic() {
        System.out.println("Start Music");
    }

    @Override
    public void stopmusic() {
        System.out.println("Stop Music");
    }
}

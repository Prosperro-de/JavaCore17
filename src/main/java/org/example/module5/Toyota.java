package org.example.module5;

// is - a або є чимось
public class Toyota extends Car {
    private int power;

    //has - a або має щось
    private Engine engine;
    private Person driver;

    @Override
    public int getMaxSpeed() {
        return 210;
    }

}

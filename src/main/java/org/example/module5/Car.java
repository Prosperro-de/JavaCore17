package org.example.module5;

public abstract class Car {
    //public private protected default (package-private)
    protected String color;
    protected int wheels;

    public abstract int getMaxSpeed();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}

package org.example.module5;

import java.util.Objects;


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

    // Контракт equals та hashCode
    // Якщо об'єкти рівни по equals то вони будуть рівні і по hashCode
    // Якщо у об'єктів однаковий хеш код то вони не обов'язково будуть рівні по equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, wheels);
    }
}

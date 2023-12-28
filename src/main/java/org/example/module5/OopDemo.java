package org.example.module5;

import java.lang.reflect.Field;

public class OopDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        Car firstCar = new Car();
////        String name = new String("Mykola"); //"Mykola"
//        firstCar.color = "black";
//        firstCar.move("work");
//
//
//        Car secondCar = new Car();
//        secondCar.color = "green";
//        secondCar.move("home");
//
//        System.out.println("firstCar.getColor() = " + firstCar.getColor());
//        System.out.println("secondCar.getColor() = " + secondCar.getColor());
//        System.out.println("firstCar.getModel() = " + firstCar.getModel());
//        System.out.println("secondCar.getModel() = " + secondCar.getModel());
//
//        String model = Car.model;
//        System.out.println("model = " + model);

//        Person mykola = new Person();
//        mykola.setName("Mykola");
//        mykola.setAge(32);
//
//        Person stepan = new Person();
//        stepan.setName("Stepan");
//        stepan.setAge(25);
//
//
//        print(mykola);
//        print(stepan);

        Audi audi = new Audi();
        audi.setColor("Black");
        audi.setWheels(4);
//        printCar(audi);
//        System.out.println("audi.getMaxSpeed() = " + audi.getMaxSpeed());

        Car toyota = new Toyota();
        toyota.setColor("Blue");
        toyota.setWheels(6);
        printCar(toyota);

        Car anotherToyota = new Toyota();
        toyota.setColor("Blue");
        toyota.setWheels(6);
//        System.out.println("toyota = " + toyota);
//        System.out.println("toyota.getMaxSpeed() = " + toyota.getMaxSpeed());
//        System.out.println("toyota.equals(anotherToyota) = " + toyota.equals(anotherToyota));
//        System.out.println("toyota.hashCode() = " + toyota.hashCode());
//        System.out.println("anotherToyota.hashCode() = " + anotherToyota.hashCode());
//        printCar(audi);
//        printCar(toyota);

//        Math math = new Math();
//        int multiply = math.multiply(2, 5);
//        System.out.println("multiply = " + multiply);
//        long first = 123423562112352L;
//        long second = 1234212362112352L;
//        long longResult = math.multiply(first, 3);
//        System.out.println("longResult = " + longResult);

//        Person person = new Person();
//        Class personClass = person.getClass();
//        Field name = personClass.getDeclaredField("name");
//        name.setAccessible(true);
//        String personName = (String)name.get(person);
//        System.out.println("personName = " + personName);

//        Class personClass = Person.class;

    }

//    private static void print(Person person) {
//        person.setAge(-13);
//        System.out.println("person = " + person);
//    }

    private static void printCar(Car car) {
        System.out.println(car.toString());
    }

}

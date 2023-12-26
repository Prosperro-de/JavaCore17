package org.example.module5;

public class OopDemo {
    public static void main(String[] args) {
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
        printCar(audi);
        System.out.println("audi.getMaxSpeed() = " + audi.getMaxSpeed());

        Car toyota = new Toyota();
        toyota.setColor("Blue");
        toyota.setWheels(6);
        printCar(toyota);
        System.out.println("toyota = " + toyota);
        System.out.println("toyota.getMaxSpeed() = " + toyota.getMaxSpeed());
        
    }

//    private static void print(Person person) {
//        person.setAge(-13);
//        System.out.println("person = " + person);
//    }

    private static void printCar(Car car) {
        System.out.println(car.toString());
    }

}

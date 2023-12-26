package org.example.module5;

public class Person {
    private int age;
    private String name = "Mykola";

    //Getter & Setter
    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

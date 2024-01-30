package org.example.module9.generic.genericsort;

public class Animal implements Comparable<Animal>{
    protected int age;

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(age, o.age);
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

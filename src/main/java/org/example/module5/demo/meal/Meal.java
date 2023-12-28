package org.example.module5.demo.meal;

public abstract class Meal {

    public void cook() {
        System.out.println("Boiling water");
        System.out.println("Add vegetables");
        getIngredient();
        System.out.println(getClass().getSimpleName() + " is ready");
    }

    protected abstract void getIngredient();
}

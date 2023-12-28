package org.example.module5.demo;

import java.util.Objects;

public class Order {
    private Class mealType;

    public Class getMealType() {
        return mealType;
    }

    public void orderMeal(Class mealType) {
        this.mealType = mealType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(mealType, order.mealType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mealType);
    }
}

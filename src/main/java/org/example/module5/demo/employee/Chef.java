package org.example.module5.demo.employee;

import org.example.module5.demo.Order;
import org.example.module5.demo.meal.FishSoup;
import org.example.module5.demo.meal.Meal;
import org.example.module5.demo.meal.TomatoSoup;

public class Chef extends Employee {
    private Order order;
    private Meal meal;

    public void receiveOrder(Order order) {
        System.out.println(getClass().getSimpleName() + " " + getName() + " received order");
        this.order = order;
    }

    public void cook() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " started cooking");
        Class mealType = order.getMealType();
        if (mealType.equals(TomatoSoup.class)) {
            meal = new TomatoSoup();
        } else if (mealType.equals(FishSoup.class)) {
            meal = new FishSoup();
        }
        meal.cook();
    }
}

package org.example.module5.demo.employee;

import org.example.module5.demo.Order;

public class Waiter extends Employee {
    private Order order;

    public void receiveOrder(Order order) {
        System.out.println(getClass().getSimpleName() + " " + getName() + " received order");
        this.order = order;
    }

    public void getOrderToChef(Chef chef) {
        System.out.println(getClass().getSimpleName() + " " + getName() + " got order to Chef");
        chef.receiveOrder(order);
    }
}

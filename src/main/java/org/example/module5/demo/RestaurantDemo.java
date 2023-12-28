package org.example.module5.demo;

import org.example.module5.demo.employee.Chef;
import org.example.module5.demo.employee.Waiter;
import org.example.module5.demo.meal.FishSoup;
import org.example.module5.demo.meal.TomatoSoup;

import java.util.Scanner;

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.setName("Dmytro");
        Waiter waiter = new Waiter();
        waiter.setName("Mykola");

        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        boolean isOrdered = false;

        while (!isOrdered) {
            System.out.println("Please order your meal. TomatoSoup or FishSoup");
            String customerReply = scanner.nextLine();
            if (TomatoSoup.class.getSimpleName().equalsIgnoreCase(customerReply)) {
                order.orderMeal(TomatoSoup.class);
                isOrdered = true;
            } else if (FishSoup.class.getSimpleName().equalsIgnoreCase(customerReply)) {
                order.orderMeal(FishSoup.class);
                isOrdered = true;
            } else  {
                System.out.println("Please order FishSoup or TomatoSoup");
            }
        }
        waiter.receiveOrder(order);
        waiter.getOrderToChef(chef);
        chef.cook();
    }
}

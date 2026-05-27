package com.pluralsight.model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Order {
    private ArrayList<MenuItem> orderedItems = new ArrayList<>();
    private LocalDateTime orderDateTime;
    private double orderAmount;

    public Order(ArrayList<MenuItem> orderedItems, double orderAmount) {
        this.orderedItems = orderedItems;
        this.orderAmount = orderAmount;
    }

    public ArrayList<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(ArrayList<MenuItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public static String getCurrentTime() {
        LocalDateTime unformattedDateTime = LocalDateTime.now();
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        return unformattedDateTime.format(dateTime);
    }

}



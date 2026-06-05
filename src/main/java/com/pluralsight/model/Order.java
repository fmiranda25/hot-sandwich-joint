package com.pluralsight.model;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Order {
    private List<MenuItem> menuItems = new ArrayList<>();
    private LocalDateTime orderDateTime;

    public Order() {

    }

    public Order(List<MenuItem> menuItems, LocalDateTime orderDateTime) {
        this.menuItems = menuItems;
        this.orderDateTime = orderDateTime;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public static String getDateTime() {
        LocalDateTime unformattedDateTime = LocalDateTime.now();
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
        return unformattedDateTime.format(dateTime);
    }

    public static String createReceiptDateTime() {
        LocalDateTime unformattedDateTime = LocalDateTime.now();
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd, hh:mm:ss");
        return unformattedDateTime.format(dateTime);
    }

    public double getOrderTotal() {
        double total = 0;

        for (MenuItem menuItem : menuItems) {
            total += menuItem.getPrice();
        }

        return total;
    }

    public String toReceiptText() {
        double total = getOrderTotal();
        StringBuilder finalReceipt = new StringBuilder();
        finalReceipt.append("Order Details\n");
        finalReceipt.append(Order.createReceiptDateTime() + "\n");
        finalReceipt.append("\n");

        for (MenuItem menuItem : menuItems) {
            finalReceipt.append(menuItem);
            finalReceipt.append("\n");
            total += menuItem.getPrice();
        }
        finalReceipt.append(String.format("Total: $%.2f\n", total));
        return finalReceipt.toString();
    }
/*
    @Override
    public String toString() {
        double total = 0;
        StringBuilder finalReceipt = new StringBuilder();
        finalReceipt.append("Order Details\n");
        finalReceipt.append(Order.getDateTime() + "\n");
        finalReceipt.append("\n");

        for (MenuItem menuItem : getMenuItems()) {
            finalReceipt.append(menuItem);
            System.out.println(menuItem);
            finalReceipt.append("\n");
            total += menuItem.getPrice();
        }
        finalReceipt.append(String.format("Total: $%.2f\n", total));
        return finalReceipt.toString();
    }
*/
}



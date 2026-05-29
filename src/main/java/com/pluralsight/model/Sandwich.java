package com.pluralsight.model;

import java.util.*;

public class Sandwich extends MenuItem{
    private List<Topping> toppings;
    private String sandwichSize;
    private boolean isToasted;
    private String breadType;
    private double price;

    public Sandwich() {
        toppings = new ArrayList<>();
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public void addToSandwich(Topping topping) {
        this.toppings.add(topping);
    }

    @Override
    public double getPrice() {
        if (sandwichSize == "Small") {
            price = 5.50;
        } else if (sandwichSize == "Medium") {
            price = 7.00;
        } else if (sandwichSize == "Large") {
            price = 8.50;
        }
        for (Topping topping : toppings) {
            price += topping.getPrice(sandwichSize);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();

        receipt.append("=== Sandwich ===\n");
        receipt.append("Size: ").append(sandwichSize).append("\n");
        receipt.append("Bread: ").append(breadType).append("\n");
        receipt.append("Toasted: ").append(isToasted ? "Yes" : "No").append("\n");

        receipt.append("Toppings:\n");

        if (toppings.isEmpty()) {
            receipt.append("  None\n");
        } else {
            for (Topping topping : toppings) {
                receipt.append("  - ").append(topping).append("\n");
            }
        }

        receipt.append(String.format("Price: $%.2f\n", getPrice()));

        return receipt.toString();
    }


}

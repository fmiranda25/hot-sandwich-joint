package com.pluralsight.model;

public class Drink extends MenuItem{
    private String drinkSize;
    private String drinkType;
    private double price;

    public Drink(String drinkSize, String drinkType) {
        this.drinkSize = drinkSize;
        this.drinkType = drinkType;
    }

    public Drink() {

    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    @Override
    public double getPrice() {
        if (drinkSize == "Small") {
            price = 2.00;
        } else if (drinkSize == "Medium") {
            price = 2.50;
        } else if (drinkSize == "Large") {
            price = 3.00;
        }
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();

        receipt.append("=== Drink ===\n");
        receipt.append("Size: ").append(drinkSize).append("\n");
        receipt.append("Type: ").append(drinkType).append("\n");

        receipt.append(String.format("Price: $%.2f\n", getPrice()));
        return receipt.toString();
    }

}

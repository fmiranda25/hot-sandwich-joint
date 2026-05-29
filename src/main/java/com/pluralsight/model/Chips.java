package com.pluralsight.model;

public class Chips extends MenuItem{
    private String chipsType;

    public Chips(String chipsType) {
        this.chipsType = chipsType;
    }

    public Chips() {

    }

    public String getChipsType() {
        return chipsType;
    }

    public void setChipsType(String chipsType) {
        this.chipsType = chipsType;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        StringBuilder receipt = new StringBuilder();

        receipt.append("=== Chips ===\n");
        receipt.append("Flavor: ").append(chipsType).append("\n");

        receipt.append(String.format("Price: $%.2f\n", getPrice()));
        return receipt.toString();
    }
}

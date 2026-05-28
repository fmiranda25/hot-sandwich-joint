package com.pluralsight.model;

public class Chips extends MenuItem{
    private String chipsType;
    private double price;

    public Chips(String chipsType) {
        super();
        this.chipsType = chipsType;
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

}

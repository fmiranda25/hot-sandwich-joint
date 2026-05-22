package com.pluralsight.model;

public class Drink extends MenuItem{
    private String drinkSize;
    private String drinkType;

    public Drink(String drinkSize, String drinkType) {
        this.drinkSize = drinkSize;
        this.drinkType = drinkType;
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

}

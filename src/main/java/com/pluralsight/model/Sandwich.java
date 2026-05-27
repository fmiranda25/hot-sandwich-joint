package com.pluralsight.model;

public class Sandwich extends MenuItem{
    public static String sandwichSize;
    private boolean isToasted;
    private String breadType;
    private double price;

//    public Sandwich(String size, boolean isToasted, String breadType) {
//        this.size = size;
//        this.isToasted = isToasted;
//        this.breadType = breadType;
//    }

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

    public double getPrice() {
        if (sandwichSize == "Small") {
            price = 5.50;
        } else if (sandwichSize == "Medium") {
            price = 7.00;
        } else if (sandwichSize == "Large") {
            price = 8.50;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

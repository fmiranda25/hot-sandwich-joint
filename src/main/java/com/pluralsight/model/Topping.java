package com.pluralsight.model;

public class Topping extends MenuItem{
    private String toppingType;
    private boolean isExtraTopping;
    private String size;
    private double price;

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isExtraTopping() {
        return isExtraTopping;
    }

    public void setExtraTopping(boolean extraTopping) {
        isExtraTopping = extraTopping;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public double getPrice(String sandwichSize) {
        if (isExtraTopping) {
            if (sandwichSize == "Small") {
                price = 1.00;
            } else if (sandwichSize == "Medium") {
                price = 2.00;
            } else if (sandwichSize == "Large") {
                price = 3.00;
            }
            price += price / 2;
        } else {
            if (sandwichSize == "Small") {
                price = 1.00;
            } else if (sandwichSize == "Medium") {
                price = 2.00;
            } else if (sandwichSize == "Large") {
                price = 3.00;
            }
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return toppingType + " " + getPrice();
    }

}

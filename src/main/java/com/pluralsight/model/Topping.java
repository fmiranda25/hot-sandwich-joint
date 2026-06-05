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
        if (isExtraTopping && (toppingType.equals("Steak") ||
                toppingType.equals("Ham") ||
                toppingType.equals("Salami") ||
                toppingType.equals("Roast Beef") ||
                toppingType.equals("Chicken") ||
                toppingType.equals("Bacon"))) {
            if (sandwichSize == "Small") {
                price = 0.50;
            } else if (sandwichSize == "Medium") {
                price = 1.00;
            } else if (sandwichSize == "Large") {
                price = 1.50;
            }
        } else if (!isExtraTopping && (toppingType.equals("Steak") ||
                toppingType.equals("Ham") ||
                toppingType.equals("Salami") ||
                toppingType.equals("Roast Beef") ||
                toppingType.equals("Chicken") ||
                toppingType.equals("Bacon"))) {
            if (sandwichSize == "Small") {
                price = 1.00;
            } else if (sandwichSize == "Medium") {
                price = 2.00;
            } else if (sandwichSize == "Large") {
                price = 3.00;
            }
        } else if (isExtraTopping && (toppingType.equals("American") ||
                toppingType.equals("Provolone") ||
                toppingType.equals("Cheddar") ||
                toppingType.equals("Swiss"))) {
            if (sandwichSize == "Small") {
                price = 0.30;
            } else if (sandwichSize == "Medium") {
                price = 0.60;
            } else if (sandwichSize == "Large") {
                price = 0.90;
            }

        } else if (!isExtraTopping && (toppingType.equals("American") ||
                toppingType.equals("Provolone") ||
                toppingType.equals("Cheddar") ||
                toppingType.equals("Swiss"))) {
            if (sandwichSize == "Small") {
                price = 0.75;
            } else if (sandwichSize == "Medium") {
                price = 1.50;
            } else if (sandwichSize == "Large") {
                price = 2.25;
            }
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return toppingType + ": $" + getPrice();
    }

}

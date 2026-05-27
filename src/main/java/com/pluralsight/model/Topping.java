package com.pluralsight.model;

import static com.pluralsight.model.Sandwich.sandwichSize;

public class Topping {
    private String meatType;
    private String cheeseType;
    private String veggieType;
    private String sauceType;
    private String sideType;
    private boolean isExtraTopping;
    private String size;
    private double price;

//    public Topping(boolean isMeat, boolean isCheese, boolean isSauce, String size) {
//        this.isMeat = isMeat;
//        this.isCheese = isCheese;
//        this.isSauce = isSauce;
//        this.size = size;
//    }


    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public String getVeggieType() {
        return veggieType;
    }

    public void setVeggieType(String veggieType) {
        this.veggieType = veggieType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getSideType() {
        return sideType;
    }

    public void setSideType(String sideType) {
        this.sideType = sideType;
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

    public double getPrice() {
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
}

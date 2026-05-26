package com.pluralsight.model;

public class Topping {
    private String meatType;
    private String cheeseType;
    private String veggieType;
    private String sauceType;
    private String sideType;
    private String size;
    private boolean isExtraTopping;

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
}

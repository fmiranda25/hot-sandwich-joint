package com.pluralsight.model;

public class Topping {
    private boolean isMeat;
    private boolean isCheese;
    private boolean isSauce;
    private String size;

    public Topping(boolean isMeat, boolean isCheese, boolean isSauce, String size) {
        this.isMeat = isMeat;
        this.isCheese = isCheese;
        this.isSauce = isSauce;
        this.size = size;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public void setCheese(boolean cheese) {
        isCheese = cheese;
    }

    public boolean isSauce() {
        return isSauce;
    }

    public void setSauce(boolean sauce) {
        isSauce = sauce;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}

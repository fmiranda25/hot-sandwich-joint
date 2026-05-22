package com.pluralsight.model;

public class Chips extends MenuItem{
    private String chipsType;

    public Chips(String chipsType) {
        this.chipsType = chipsType;
    }

    public String getChipsType() {
        return chipsType;
    }

    public void setChipsType(String chipsType) {
        this.chipsType = chipsType;
    }
}

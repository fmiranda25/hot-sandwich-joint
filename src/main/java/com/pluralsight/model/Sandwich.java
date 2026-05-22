package com.pluralsight.model;

public class Sandwich extends MenuItem{
    private String size;
    private boolean isToasted;
    private String breadType;

//    public Sandwich(String size, boolean isToasted, String breadType) {
//        this.size = size;
//        this.isToasted = isToasted;
//        this.breadType = breadType;
//    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

}

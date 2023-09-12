package com.giriraj.coffemachine.model;

public enum BeverageType {
    HOT_TEA("hot_tea"),
    HOT_COFFEE("hot_coffee"),
    BLACK_TEA("black_tea"),
    GREEN_TEA("green_tea");

    private String beverageType;

    BeverageType(String beverageType) {
        this.beverageType = beverageType;
    }

    public String getBeverageType() {
        return beverageType;
    }
}

package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100),  // Double yerine Integer
    PREMIUM("Premium Plan", 200); // Double yerine Integer

    private final String name;
    private final Integer price;

    Plan(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}

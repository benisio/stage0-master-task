package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String description = "This animal is mostly " + color + ". It has " + numberOfPaws;

        if (numberOfPaws == 1) {
            description += " paw and ";
        } else {
            description += " paws and ";
        }

        description = hasFur ? description + "a fur." : description + "no fur.";

        return description;
    }
}
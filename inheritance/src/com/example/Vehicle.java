package com.example;

public class Vehicle {
    
    private String make;
    private String model;
    private String colour;

    public Vehicle(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public String getMake() {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    @Override
    public String toString() {
        return String.format("Make: %s\nModel: %s\nColour: %s", make, model, colour);
    }
}

package com.example;

public class Truck extends Vehicle {

    private int payload;

    public Truck(String make, String model, String colour, int payload) {
        super(make, model, colour);
        this.payload = payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }
    public int getPayload() {
        return payload;
    }
    @Override
    public String toString() {
        return String.format("%s\nPayload: %d\n", super.toString(), payload);
    }
    
}
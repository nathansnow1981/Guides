package com.example;

public class Car extends Vehicle {

    private int seats;

    public Car(String make, String model, String colour, int seats) {
        super(make, model, colour);
        this.seats = seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getSeats() {
        return seats;
    }
    @Override
    public String toString() {
        return String.format("%s\nSeats: %d\n", super.toString(), seats);
    }
    
}

package com.example;

public class Inheritance {
    public static void main(String[] args) throws Exception {

        Car car = new Car("Ford", "Raptor", "Yellow", 5);
        System.out.println(car);

        Truck truck = new Truck("Mack", "Titan", "Bronze", 16_000);
        System.out.println(truck);
        
    }
}

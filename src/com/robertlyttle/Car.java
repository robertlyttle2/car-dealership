package com.robertlyttle;

public class Car {
    private final String make;
    private final String model;
    private double price;
    private final int year;
    private int mileage;
    private final String fuelType;
    private final String transmission;

    public Car(String make, String model, double price, int year, int mileage, String fuelType, String transmission) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.mileage = mileage;
        this.fuelType = fuelType;
        this.transmission = transmission;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    @Override
    public String toString() {
        return "Car: " + this.make + " " + this.model + "\nPrice (£): " + this.price +
                "\nYear: " + this.year + "\nMileage: " + this.mileage +
                "\nFuel: " + this.fuelType + "\nTransmission: " + this.transmission;

    }
}

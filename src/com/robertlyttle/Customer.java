package com.robertlyttle;

import java.util.Random;

public class Customer {
    private final String name;
    private double deposit;
    private final int creditRating;
    private boolean isTakingFinance;

    public Customer(String name, double deposit, boolean isTakingFinance) {
        this.name = name;
        this.deposit = deposit;
        this.creditRating = generateRandomCreditRating();
        this.isTakingFinance = isTakingFinance;
    }

    // For testing
    public int generateRandomCreditRating() {
        int min = 1;
        int max = 10;

        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public String getName() {
        return name;
    }

    public double getDeposit() {
        return deposit;
    }

    public int getCreditRating() {
        return creditRating;
    }

    public boolean isTakingFinance() {
        return isTakingFinance;
    }

    @Override
    public String toString() {
        return "Customer Name: " + this.name + "\nDeposit (£): " + this.deposit;
    }
}

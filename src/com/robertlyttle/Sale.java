package com.robertlyttle;

import java.time.LocalDate;

public class Sale {
    private LocalDate dateOfSale;
    private Customer customer;
    private Car car;
    private Employee employee;
    private double balance;

    public Sale(LocalDate dateOfSale, Customer customer, Car car, Employee employee, double balance) {
        this.dateOfSale = dateOfSale;
        this.customer = customer;
        this.car = car;
        this.employee = employee;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Date of Sale: " + this.dateOfSale + "\n" + customer + "\n" + car + "\n" + employee;
    }
}

package com.robertlyttle;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public boolean sellCar(Customer customer, Car car, Dealership dealership) {
        if (customer.isTakingFinance()) {
            if (!runCustomerCreditCheck(customer)) {
                return false;
            }
            dealership.processSale(customer, car, this);
            return true;
        }

        dealership.processSale(customer, car, this);
        return true;
    }

    public boolean runCustomerCreditCheck(Customer customer) {
        if (customer.getCreditRating() < 6) {
            System.out.println("Customer: " + customer.getName() + ", credit check status: FAILED");
            return false;
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee Name: " + this.name;
    }
}

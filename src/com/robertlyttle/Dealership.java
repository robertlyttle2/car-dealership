package com.robertlyttle;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dealership {
    private final String name;
    private double bankBalance;
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;
    private ArrayList<Sale> salesList;

    public Dealership(String name) {
        this.name = name;
        this.bankBalance = 0;
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.salesList = new ArrayList<>();
    }

    public void updateBankBalance(Double amount) {
        this.bankBalance += amount;
    }

    public void processSale(Customer customer, Car car, Employee employee) {
        Sale sale = new Sale(LocalDate.now(), customer, car, employee, car.getPrice());
        this.updateBankBalance(car.getPrice());
        this.removeCar(car);
        this.addSale(sale);
    }

    public boolean addCar(Car car) {
        if (this.cars.contains(car)) {
            return false;
        }
        this.cars.add(car);
        return true;
    }

    public boolean removeCar(Car car) {
        if (!this.cars.contains(car)) {
            System.out.println("Car not in database");
            return false;
        }
        this.cars.remove(car);
        return true;
    }

    public boolean addEmployee(Employee employee) {
        if (this.employees.contains(employee)) {
            return false;
        }
        this.employees.add(employee);
        return true;
    }

    public boolean addCustomer(Customer customer) {
        if (this.customers.contains(customer)) {
            return false;
        }
        this.customers.add(customer);
        return true;
    }

    public boolean addSale(Sale sale) {
        if (this.salesList.contains(sale)) {
            return false;
        }
        this.salesList.add(sale);
        return true;
    }

    public Customer getCustomer(String customerName) {
        for (Customer customer : this.customers) {
            if (customerName.equals(customer.getName())) {
                return customer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Sale> getSalesList() {
        return salesList;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", bankBalance=" + bankBalance +
                ", cars=" + cars +
                ", customers=" + customers +
                ", employees=" + employees +
                ", salesList=" + salesList +
                '}';
    }
}

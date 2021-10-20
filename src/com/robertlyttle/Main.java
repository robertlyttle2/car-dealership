package com.robertlyttle;

public class Main {

    public static void main(String[] args) {

        Dealership dealership = new Dealership("Rob's Cars");

        Employee david = new Employee("David", "Sales Executive");
        Employee carl = new Employee("Carl", "Sales Executive");
        Employee andrew = new Employee("Andrew", "Sales Executive");
        dealership.addEmployee(david);
        dealership.addEmployee(carl);
        dealership.addEmployee(andrew);

        Car audi = new Car("Audi", "A3", 12000, 2016, 56000, "Diesel", "Manual");
        Car honda = new Car("Honda", "Civic", 9000, 2019, 32000, "Diesel", "Manual");
        Car hyundai = new Car("Hyundai", "I3", 6500, 2018, 36700, "Diesel", "Manual");
        Car nissan = new Car("Nissan", "Qashqai", 11500, 2020, 1200, "Petrol", "Manual");
        dealership.addCar(audi);
        dealership.addCar(honda);
        dealership.addCar(hyundai);
        dealership.addCar(nissan);

        Customer katie = new Customer("Katie", 1400, true);
        Customer terri = new Customer("Terri", 3600, true);
        Customer kyle = new Customer("Kyle", 2000, true);
        dealership.addCustomer(katie);
        dealership.addCustomer(terri);
        dealership.addCustomer(kyle);

        david.sellCar(katie, honda, dealership);
        david.sellCar(katie, nissan, dealership);
        carl.sellCar(terri, hyundai, dealership);
        andrew.sellCar(kyle, audi, dealership);

        printSalesList(dealership);

    }

    private static void printSalesList(Dealership dealership) {
        System.out.println("SALES: " + dealership.getName().toUpperCase());
        System.out.println("BALANCE (£): " + dealership.getBankBalance());
        if (dealership.getSalesList().isEmpty()) {
            System.out.println("No sales");
        }
        System.out.println("================================");
        for (Sale sale : dealership.getSalesList()) {
            System.out.println(sale);
            System.out.println("================================");
        }
    }

}

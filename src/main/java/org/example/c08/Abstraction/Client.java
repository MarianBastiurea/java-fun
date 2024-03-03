package org.example.c08.Abstraction;

public interface Client {
    double monthlySalary();
}

class EmployeeClient implements Account, Client {
    String firstName;
    String LastName;
    double hourlyRates;
    double timeSheet;


    public EmployeeClient(String firstName, String lastName, double hourlyRates, double timeSheet) {
        this.firstName = firstName;
        LastName = lastName;
        this.hourlyRates = hourlyRates;
        this.timeSheet = timeSheet;

    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return LastName;
    }

    public double getHourlyRates() {
        return hourlyRates;
    }


    public double getTimeSheet() {
        return timeSheet;
    }


    @Override
    public double deposit(double amount) {
        return 0;
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public double monthlySalary() {
        return getTimeSheet() * getHourlyRates();
    }
}

package org.example.c08.abstraction;

/*
Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount,
and CurrentAccount.
The bank should have a list of accounts and methods for adding them.
Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances.
SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
 */
interface Account {
    double deposit(double amount);

    double withdraw(double amount);

    double getBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public double deposit(double amount) {
        return balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        return balance -= amount;
    }

    public double applyInterest(double interestRate) {
        return balance += balance * interestRate / 100;
    }


    @Override
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double deposit(double amount) {
        return balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        return balance -= amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public double transferSendMoney(double amount) {
        return balance -= amount;
    }

    public double transferReceiveMoney(double amount) {
        return balance += amount;
    }

}
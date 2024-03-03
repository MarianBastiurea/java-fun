package org.example.c08.Abstraction;

/*
Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective
methods to handle deposits and withdrawals for each account type.
 */
public abstract class BankAccount {
    abstract double deposit();

    abstract double withdraw();
}

class SavingsAccount1 extends BankAccount {
    double balance;
    double amountDeposit;
    double amountWithdraw;

    public SavingsAccount1 (double balance, double amountDeposit, double amountWithdraw) {
        this.balance = balance;
        this.amountDeposit = amountDeposit;
        this.amountWithdraw = amountWithdraw;
    }

    @Override
    double deposit() {
        balance += amountDeposit;
        return balance;
    }

    @Override
    double withdraw() {
        balance -= amountWithdraw;
        if (balance < 0) {
            System.out.println("You don't have enough money in your account to withdraw this amount." +
                    "Try another amount");
        }
        return balance;
    }
}

class CurrentAccount1 extends BankAccount {
    double balance;
    double amountDeposit;
    double amountWithdraw;

    public CurrentAccount1 (double balance, double amountDeposit, double amountWithdraw) {
        this.balance = balance;
        this.amountDeposit = amountDeposit;
        this.amountWithdraw = amountWithdraw;
    }

    @Override
    double deposit() {
        balance += amountDeposit;
        return balance;
    }

    @Override
    double withdraw() {
        balance -= amountWithdraw;
        if (balance < 0) {
            System.out.println("You don't have enough money in your account to withdraw this amount." +
                    "Try another amount");
        }
        return balance;
    }
}

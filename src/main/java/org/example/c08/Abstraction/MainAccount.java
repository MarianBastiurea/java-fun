package org.example.c08.Abstraction;

public class MainAccount {
    public static void main(String[] args) {
        EmployeeClient newClient = new EmployeeClient("Marian", "Bastiurea", 20,
                287.9);
        System.out.println("hourlyRates is: " + newClient.getHourlyRates());
        System.out.println("Monthly Salary for " + newClient.getFirstName() + " " + newClient.getLastName() + " is " +
                newClient.monthlySalary());

        // Create a SavingsAccount with an initial deposit and interest rate
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");

        // Create a CurrentAccount with an initial deposit and overdraft limit
        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00");

        // Add the SavingsAccount and CurrentAccount to the bank
        Bank bank = new Bank();

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nNow deposit 20% from monthly payment to Savings Account.");
        double monthlySavings=0.2*newClient.monthlySalary();
        System.out.println(monthlySavings);

        // Deposit $100 into the SavingsAccount
        bank.deposit(savingsAccount, monthlySavings);
        System.out.println("new balance of Saving Account is: ");
        bank.printAccountBalances(savingsAccount);
        System.out.println("Now deposit $500 to Current Account.");
        // Deposit $500 into the CurrentAccount
        bank.deposit(currentAccount, 500.0);

        System.out.println("Withdraw $150 from Savings Account.\n");
        // Withdraw $150 from the SavingsAccount
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\nSavings A/c and Current A/c.:");

        // Print the balances of all accounts in the bank
        bank.printAccountBalances(savingsAccount);

        // Apply interest to the SavingsAccount
        savingsAccount.applyInterest(5);
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");

        // Print the balances of all accounts in the bank after applying interest
        bank.printAccountBalances(currentAccount);


    }
}

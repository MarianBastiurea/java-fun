package org.example.c08.Abstraction;

public class MainAccount {
    public static void main(String[] args) {
        EmployeeClient newClient = new EmployeeClient("Marian", "Bastiurea", 20,
                287.9);
        System.out.println("hourlyRates is: " + newClient.getHourlyRates());
        System.out.println("Monthly Salary for " + newClient.getFirstName() + " " + newClient.getLastName() + " is " +
                newClient.monthlySalary());

        Bank Barclays = new Bank();
        Bank HSBC = new Bank();

        // Create a SavingsAccount with an initial deposit and interest rate in Barclays Bank
        SavingsAccount savingsAccountBarclays = new SavingsAccount(1000.0, 1.25);
        System.out.println("Barclays Savings Account:\nInitial Deposit:" +
                savingsAccountBarclays.getBalance() +
                "\nInterest rate:" + savingsAccountBarclays.getInterestRate() + "%");

        // Create a CurrentAccount with an initial deposit and overdraft limit in Barclays Bank
        CurrentAccount currentAccountBarclays = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nBarclays Current Account:\n" +
                "Initial Deposit:" + currentAccountBarclays.getBalance() + "\nOverdraft Limit: $1000.00");


        // Create a SavingsAccount with an initial deposit and interest rate in HSBC Bank
        SavingsAccount savingAccountHSBC = new SavingsAccount(1500, 2.78);
        System.out.println("HSBC Saving Accounts:\n Initial Deposit:" +
                savingAccountHSBC.getBalance() + "\n Interest rate " + savingAccountHSBC.getInterestRate() + "%");

        // Create a CurrentAccount with an initial deposit and overdraft limit in Barclays Bank
        CurrentAccount currentAccountHSBC = new CurrentAccount(750, 5000);
        System.out.println("Balance for HSBC current account is " + currentAccountHSBC.getBalance());

        HSBC.addAccount(savingAccountHSBC);
        HSBC.addAccount(currentAccountHSBC);

        Barclays.addAccount(savingsAccountBarclays);
        Barclays.addAccount(currentAccountBarclays);


        System.out.println("\nNow deposit 20% from monthly payment to Barclays Savings Account.");
        double monthlySavings = 0.2 * newClient.monthlySalary();
        System.out.println(monthlySavings);

        // 20% from monthly payment to Barclays Saving Account
        Barclays.deposit(savingsAccountBarclays, monthlySavings);
        System.out.println("new balance of Barclays Saving Account is: ");
        Barclays.printAccountBalances(savingsAccountBarclays);
        System.out.println("Now deposit $500 to Barclays Current Account.");
        // Deposit $500 into the CurrentAccount
        Barclays.deposit(currentAccountBarclays, 500.0);

        System.out.println("Withdraw $150 from Barclays Savings Account.\n");
        // Withdraw $150 from the SavingsAccount
        Barclays.withdraw(savingsAccountBarclays, 150.0);
        System.out.println("\n Barclays Savings Account and Current Account:");

        // Print the balances of all accounts in the Barclays
        Barclays.printAccountBalances(savingsAccountBarclays);
        Barclays.printAccountBalances(currentAccountBarclays);

        // Apply interest to the SavingsAccount
        savingsAccountBarclays.applyInterest(5);
        System.out.println("\nAfter applying interest on Barclays Savings Account for 1 year:");
        // Print the balances of all accounts in the Barclays after applying interest
        Barclays.printAccountBalances(savingsAccountBarclays);


        //Transfer 200$ from Barclays current account to HSBC current account
        System.out.println("Balance for Barclays current account before transfer money to HSBC current account: "
                + currentAccountBarclays.getBalance());
        System.out.println("balance for HSBC current account before receive 200$ from Barclays current account: "
                + currentAccountHSBC.getBalance());
        HSBC.transferSendMoney(currentAccountBarclays, 200, currentAccountHSBC);
        System.out.println("Barclays current account after transfer a 200$ to HSBC current account " +
                currentAccountBarclays.getBalance());
        System.out.println("HSBC current account after receive 200$ from Barclays current account " +
                currentAccountHSBC.getBalance());
    }
}

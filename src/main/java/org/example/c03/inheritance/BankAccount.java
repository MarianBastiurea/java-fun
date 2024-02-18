package org.example.c03.inheritance;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public void depositsFunds(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + " made. New balance is $ " + accountBalance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("InsufficientFunds! You only have $ " + accountBalance + " in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of amount of $ " + withdrawalAmount + " processed." +
                    " Remaining balance=$ " + accountBalance);
        }
    }

    public void changePhoneNumber(String newPhoneNumber) {
        customerPhoneNumber = newPhoneNumber;
        System.out.println("New Phone number is: " + customerPhoneNumber);
    }

    public void displayPhoneNumber() {
        System.out.println("Phone number is: " + getCustomerPhoneNumber());
    }

    public void getNewAccountBalance() {
        System.out.println("Account balance is: " + getAccountBalance());
    }

    public void getClientName() {
        System.out.println("Customer name is: " + getCustomerName());
    }

    public void getClientEmail() {
        System.out.println("Customer email is: " + getCustomerEmail());
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

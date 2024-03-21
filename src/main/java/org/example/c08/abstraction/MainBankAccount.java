package org.example.c08.abstraction;

public class MainBankAccount {
    public static void main(String[] args) {
        SavingsAccount1 savingsAccount = new SavingsAccount1(200, 300, 100);
        System.out.println("Balance of Saving Account after deposit " + savingsAccount.amountDeposit + " is "
                + savingsAccount.deposit());
        System.out.println("Balance of Saving account after withdrawal of " + savingsAccount.amountWithdraw + " is " +
                savingsAccount.withdraw());
        CurrentAccount1 currentAccount = new CurrentAccount1(300, 100, 60000);
        System.out.println("Balance of Current Account after deposit " + currentAccount.amountDeposit + " is "
                + currentAccount.deposit());
        System.out.println("Balance of Current account after withdrawal of " + currentAccount.amountWithdraw + " is " +
                currentAccount.withdraw());
    }
}

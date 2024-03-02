package org.example.c08.Abstraction;

public class MainBankAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(200, 300, 100);
        System.out.println("Balance of Saving Account after deposit " + savingsAccount.amountDeposit + " is "
                + savingsAccount.deposit());
        System.out.println("Balance of Saving account after withdrawal of " + savingsAccount.amountWithdraw + " is " +
                savingsAccount.withdraw());
        CurrentAccount currentAccount = new CurrentAccount(300, 100, 60000);
        System.out.println("Balance of Current Account after deposit " + currentAccount.amountDeposit + " is "
                + currentAccount.deposit());
        System.out.println("Balance of Current account after withdrawal of " + currentAccount.amountWithdraw + " is " +
                currentAccount.withdraw());
    }
}

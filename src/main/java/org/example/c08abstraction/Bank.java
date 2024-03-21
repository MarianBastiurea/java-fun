package org.example.c08abstraction;

import java.util.*;

public class Bank {
    private List accounts;
    private List sendingMoneyAccount;
    private List receivingMoneyAccount;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public double deposit(Account account, double amount) {
        return account.deposit(amount);
    }


    public double withdraw(Account account, double amount) {

        return account.withdraw(amount);
    }

    public void transferSendMoney(Account sendingMoneyAccount, double amount, Account receivingMoneyAccount) {
        sendingMoneyAccount.withdraw(amount);
        receivingMoneyAccount.deposit(amount);

    }

    public void printAccountBalances(Account account) {
        System.out.println("Account balance: " + account.getBalance());
    }
}


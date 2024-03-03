package org.example.c08.Abstraction;
import java.util.*;
public class Bank {
    private List accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }


    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
    public void printAccountBalances(Account account) {
            System.out.println("Account balance: " + account.getBalance());
        }
}


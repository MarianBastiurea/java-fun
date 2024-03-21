package org.example.c03.inheritance;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount mariansAccount = new BankAccount();
        mariansAccount.setAccountNumber("12345");
        mariansAccount.setAccountBalance(1000);
        mariansAccount.setCustomerName("Marian Bastiurea");
        mariansAccount.setCustomerEmail("myEmail");
        mariansAccount.setCustomerPhoneNumber("123456789");


        mariansAccount.withdrawFunds(100);
        mariansAccount.depositsFunds(250);
        mariansAccount.withdrawFunds(50);
        mariansAccount.withdrawFunds(200);
        mariansAccount.withdrawFunds(200);
        mariansAccount.changePhoneNumber("073676");
        mariansAccount.displayPhoneNumber();
        mariansAccount.getNewAccountBalance();
        mariansAccount.getClientEmail();
        mariansAccount.getClientName();
    }
}
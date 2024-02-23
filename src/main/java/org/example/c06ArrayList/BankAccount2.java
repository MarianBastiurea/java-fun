package org.example.c06ArrayList;

import java.util.ArrayList;

public class BankAccount2 {

    static class Bank {
        private String name;
        private ArrayList<Branch> branches;

        public Bank(String name) {
            this.name = name;
            this.branches = new ArrayList<>();
        }

        public boolean addBranch(String branchName) {
            if (findBranch(branchName) == null) {
                branches.add(new Branch(branchName));
                return true;
            }
            return false;
        }

        public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                return branch.newCustomer(customerName, initialTransaction);
            }
            return false;
        }

        public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                return branch.addCustomerTransaction(customerName, transaction);
            }
            return false;
        }

        private Branch findBranch(String branchName) {
            for (Branch branch : branches) {
                if (branch.getName().equals(branchName)) {
                    return branch;
                }
            }
            return null;
        }

        public boolean listCustomers(String branchName, boolean printTransactions) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                System.out.println("Customer details for branch " + branch.getName());
                ArrayList<Customer> branchCustomers = branch.getCustomers();
                for (Customer customer : branchCustomers) {
                    System.out.println("Customer: " + customer.getName() + "[" + (branchCustomers.indexOf(customer) + 1) + "]");
                    if (printTransactions) {
                        System.out.println("Transactions");
                        ArrayList<Double> transactions = customer.getTransactions();
                        for (Double transaction : transactions) {
                            System.out.println("[" + (transactions.indexOf(transaction) + 1) + "] Amount " + transaction);
                        }
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

    static class Branch {
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            this.name = name;
            this.customers = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }

        public boolean newCustomer(String customerName, double initialTransaction) {
            if (findCustomer(customerName) == null) {
                customers.add(new Customer(customerName, initialTransaction));
                return true;
            }
            return false;
        }

        public boolean addCustomerTransaction(String customerName, double transaction) {
            Customer existingCustomer = findCustomer(customerName);
            if (existingCustomer != null) {
                existingCustomer.addTransaction(transaction);
                return true;
            }
            return false;
        }

        private Customer findCustomer(String customerName) {
            for (Customer customer : customers) {
                if (customer.getName().equals(customerName)) {
                    return customer;
                }
            }
            return null;
        }
    }

    static class Customer {
        private String name;
        private ArrayList<Double> transactions;

        public Customer(String name, double initialTransaction) {
            this.name = name;
            this.transactions = new ArrayList<>();
            addTransaction(initialTransaction);
        }

        public String getName() {
            return name;
        }

        public ArrayList<Double> getTransactions() {
            return transactions;
        }

        public void addTransaction(double transaction) {
            transactions.add(transaction);
        }
    }

   static class Main {
        public static void main(String[] args) {
            Bank bank = new Bank("National Australia Bank");

            bank.addBranch("Adelaide");

            bank.addCustomer("Adelaide", "Tim", 50.05);
            bank.addCustomer("Adelaide", "Mike", 175.34);
            bank.addCustomer("Adelaide", "Percy", 220.12);

            bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
            bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
            bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

            bank.listCustomers("Adelaide", true);
            System.out.println("------------------");
            bank.listCustomers("Adelaide", false);
        }
    }
}

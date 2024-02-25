package org.example.c07.Abstraction;

public class Milk extends ProductForSale{


    public Milk(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Milk pack "+ price+" "+ description);
    }
}

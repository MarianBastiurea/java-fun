package org.example.c08.abstraction;

public class Bread extends ProductForSale{
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println("Bread "+ price+" "+ description);
    }
}

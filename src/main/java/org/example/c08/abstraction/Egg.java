package org.example.c08.abstraction;

public class Egg extends ProductForSale{
    public Egg(String type, double price, String description) {
        super(type, price, description);
    }


    @Override
    public void showDetails() {
        System.out.println("Egg pack "+ price+" "+ description);
    }
}

package org.example.c04.polymorphism;

public class MainKitchen {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
        kitchen.SetKitchenState(false, true, true);
        kitchen.doKitchenWork();
    }
}

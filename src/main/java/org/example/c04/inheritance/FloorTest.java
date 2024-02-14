package org.example.c04.inheritance;

public class FloorTest {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(" Total cost of carpet is: " + calculator.getTotalCost());
    }
}

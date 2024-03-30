package org.example.test1;

public class Multiply {
    private void multiply(int number1, int number2) {
        int multiply1 = number1 * number2;
        System.out.println(" result of multiplying " + number1 + " by " + number2 + " is " + multiply1);
    }

    public static void main(String[] args) {
        Multiply newMultiply = new Multiply();
        newMultiply.multiply(2, 2);
    }
}

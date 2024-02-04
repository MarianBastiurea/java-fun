package org.example.controlFlow;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstIntegerNumber = (int) (firstNumber * 1000);
        int secondIntegerNumber = (int) (secondNumber * 1000);
        boolean areEqual = false;
        if (firstIntegerNumber == secondIntegerNumber) {
            areEqual = true;
        } else areEqual=false;
        return areEqual;
    }
}

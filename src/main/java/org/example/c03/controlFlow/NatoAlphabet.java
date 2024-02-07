package org.example.c03.controlFlow;

public class NatoAlphabet {

    public static String equivalentWord(char letter) {
        String result;
        switch (letter) {
            case 'A':
                result = "Alpha";
                break;
            case 'B':
                result = "Bravo";
                break;
            case 'C':
                result = "Charlie";
                break;
            case 'D':
                result = "Delta";
                break;
            case 'E':
                result = "Echo";
                break;
            case 'F':
                result = "Fox";
                break;
            default:
                result = "Letter " + letter + " not found";
                break;
        }
        return result;
    }
}

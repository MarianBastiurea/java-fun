package org.example.c11.LambdaExpression;

import java.util.*;
import java.util.Random;
import java.util.List;



public class ListChallenge {

    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names = {"bob", "Anna", "CHARLIE", "Eva", "Marian"};
        System.out.println("initial array of string: " + Arrays.asList(names));

        //transform all names to uppercase
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(" array after change to uppercase: " + Arrays.asList(names));

        //Add a randomly generated middle initial, and include a period.
        List<String> namesAsList = Arrays.asList(names);
        namesAsList.replaceAll(s -> s += " " + getRandomChar('A', 'D')+".");
        System.out.println(" array after add a initial: " + namesAsList);

        //Add a last name that is the reverse of the first name.
        namesAsList.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println(" array after add a firstname:");
        Arrays.asList(names).forEach(s -> System.out.println(s));
        //Finally, create a new modifiable ArrayList from your names array, removing any names where the
        // last name equals the first name.
        List<String> namesNew = new ArrayList<>(List.of(names));
        namesNew.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ") + 1);
            return first.equals(last);
        });
        System.out.println(" array after remove if firstname=lastname:");
        Arrays.asList(namesNew).forEach(s -> System.out.println(s));


    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }

}

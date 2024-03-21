package org.example.c13finalandimmutable;

import java.util.Arrays;

record Person2 (String name, String dob, Person2[] kids) {

    public Person2(Person2 p) {
        this(p.name, p.dob,
                p.kids == null ? null : Arrays.copyOf(p.kids, p.kids.length));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}
public class MainPerson2 {
    public static void main(String[] args) {

        Person2 joe = new Person2("Joe", "01/01/1961", null);
        Person2 jim = new Person2("Jim", "02/02/1962", null);
        Person2 jack = new Person2("Jack", "03/03/1963",
                new Person2[]{joe, jim});
        Person2 jane = new Person2("Jane", "04/04/1964", null);
        Person2 jill = new Person2("Jill", "05/05/1965",
                new Person2[]{joe, jim});

        Person2[] persons = {joe, jim, jack, jane, jill};
        Person2[] personsCopy = persons.clone();
//        Person[] personsCopy = Arrays.copyOf(persons, persons.length);
//        Person[] personsCopy = new Person[5];
//        Arrays.setAll(personsCopy, i -> new Person(persons[i]));

//        for (int i = 0; i < 5; i++) {
//            personsCopy[i] = new Person(persons[i]);
//        }

        var jillsKids = personsCopy[4].kids();
        jillsKids[1] = jane;

        for (int i = 0; i < 5; i++) {
            if (persons[i] == personsCopy[i]) {
                System.out.println("Equal References " + persons[i]);
            }
        }
        System.out.println(persons[4]);
        System.out.println(personsCopy[4]);
    }
}

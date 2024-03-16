package org.example.c13.Final;

public record Person1(String name, String dob) {

//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-', '/');
//    }

    public Person1(Person1 p) {
        this(p.name, p.dob);
    }

    public Person1 {
        if (dob == null) throw new IllegalArgumentException("Bad data");
        dob = dob.replace('-', '/');
    }
}


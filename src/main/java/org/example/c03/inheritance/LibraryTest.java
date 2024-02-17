package org.example.c03.inheritance;

public class LibraryTest {
    public static void main(String[] args) {
        Library bookOne = new Library("The Three Musketeers", "Alexander", "Dumas", 10);
        System.out.println(bookOne.getBookTitle());
        System.out.println(bookOne.getAuthorFirstname());
        System.out.println(bookOne.getAuthorLastname());
        System.out.println(bookOne.getBookAvailable());

        Library bookTwo = new Library();
        System.out.println(bookTwo.getBookTitle());
        System.out.println(bookTwo.getAuthorFirstname());
        System.out.println(bookTwo.getAuthorLastname());
        System.out.println(bookTwo.getBookAvailable());

        Library bookThree = new Library("Hamlet", "William", "Shakespeare");
        System.out.println(bookThree.getBookTitle());
        System.out.println(bookThree.getAuthorFirstname());
        System.out.println(bookThree.getAuthorLastname());
        System.out.println(bookThree.getBookAvailable());
    }

}

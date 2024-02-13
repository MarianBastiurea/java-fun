package org.example.c04.inheritance;

public class BookTest {
    public static void main(String[] args) {
        Book goneWithTheWind = new Book();
        goneWithTheWind.setAuthorFirstname("Margaret");
        goneWithTheWind.setAuthorLastname("Mitchell");
        goneWithTheWind.setBookTitle("Gone With The Wind");
        goneWithTheWind.setBookAvailable(10);

        goneWithTheWind.borrowABook(4);


    }
}

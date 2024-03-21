
package org.example.c03inheritance;

public class Book {
    private String authorFirstname;
    private String authorLastname;
    private int bookAvailable;
    private String bookTitle;


    public void borrowABook(int borrowingQuantity) {
        if (bookAvailable - borrowingQuantity <= 3) {
            System.out.println("Book " + getBookTitle() + " by " + getAuthorFirstname() + " " + getAuthorLastname());
            System.out.println("Book available " + bookAvailable + " are too less. It needs to buy more book");
        } else {
            bookAvailable -= borrowingQuantity;
            System.out.println("Book " + getBookTitle() + " by " + getAuthorFirstname() + " " + getAuthorLastname());
            System.out.println("Book available " + getBookAvailable());
        }

    }


    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public void setAuthorFirstname(String authorFirstname) {
        this.authorFirstname = authorFirstname;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public int getBookAvailable() {
        return bookAvailable;
    }

    public void setBookAvailable(int bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}



package org.example.c03inheritance;

public class Library {
    private String bookTitle;
    private String authorFirstname;
    private String authorLastname;
    private int bookAvailable;


    public Library() {
        this("Gone with the wind", "Margaret", "Mitchel");
    }

    public Library(String bookTitle, String authorFirstname, String authorLastname) {
        this(bookTitle, authorFirstname, authorLastname, 5);
    }

    public Library(String bookTitle, String authorFirstname, String authorLastname, int bookAvailable) {
        this.bookTitle = bookTitle;
        this.authorFirstname = authorFirstname;
        this.authorLastname = authorLastname;
        this.bookAvailable = bookAvailable;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthorFirstname() {
        return authorFirstname;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public int getBookAvailable() {
        return bookAvailable;
    }
}

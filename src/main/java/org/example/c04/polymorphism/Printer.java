package org.example.c04.polymorphism;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        tonerLevel += tonerAmount;
        if (tonerLevel < 0 || tonerLevel > 100) {
            tonerLevel = -1;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        int sheets;
        if (duplex) {
            sheets = pages / 2 + pages % 2;
            pagesPrinted += sheets;
            System.out.println("It's a duplex printer");
        } else {
            sheets = pages;
            pagesPrinted += pages;
        }
        return sheets;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}



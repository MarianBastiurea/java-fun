package org.example.c04.polymorphism;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer(40, true);
        System.out.println(printer);
        System.out.println("Add 100% toner and toner level will be " + printer.addToner(100));
        System.out.println("If I want to print 10 pages in a duplex printer, sheets number used will be: " + printer.printPages(10));
        System.out.println("If I need to print 10 pages and counter of pages printed will be " + printer.getPagesPrinted());
        System.out.println("If I want to print 100 pages in a duplex printer, sheets number used will be: " + printer.printPages(100));
        System.out.println("If I need to print 100 pages and counter of pages printed will be " + printer.getPagesPrinted());


        Printer printer1 = new Printer(70, false);
        System.out.println(printer);
        System.out.println("Add 10% toner and toner level will be " + printer1.addToner(10));
        System.out.println("Need to print 10 pages and pages printed counter will be " + printer1.printPages(10));
    }
}

package org.example.c08.Abstraction;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}
public class Store {
    private static ArrayList<ProductForSale> productForSales = new ArrayList<>();


    public static void main(String[] args) {
        productForSales.add( new Milk("pack", 2.5, "semi skimmed"));
        productForSales.add( new Bread("Sourdough", 3.0, "with cereals"));
        listProduct();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);



    }

    public static void listProduct() {
        for (var item : productForSales) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                      int qty) {
        order.add(new OrderItem(qty, productForSales.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order) {

        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}


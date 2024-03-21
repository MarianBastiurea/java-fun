package org.example.c03inheritance;


public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Marian", 1000, "myEmail");
        System.out.println(customer.getName());
        System.out.println((customer.getCreditLimit()));
        System.out.println(customer.getCustomerEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println((secondCustomer.getCreditLimit()));
        System.out.println(secondCustomer.getCustomerEmail());

        Customer thirdCustomer = new Customer("Joe", "Joe@email.com");
        System.out.println(thirdCustomer.getName());
        System.out.println((thirdCustomer.getCreditLimit()));
        System.out.println(thirdCustomer.getCustomerEmail());
    }
}

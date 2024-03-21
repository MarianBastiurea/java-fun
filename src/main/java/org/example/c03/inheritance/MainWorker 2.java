package org.example.c03.inheritance;

public class MainWorker {
    public static void main(String[] args) {
        Employee marian = new Employee("Marian", "26/05/1971", "31/12/2023");
        System.out.println(marian);
        System.out.println("Age is " + marian.getAge());
        System.out.println("Collect Pay is: " + marian.collectPay());
        SalariedEmployee vali = new SalariedEmployee("Vali", "22/05/1970",
                "03/03/2020", 40000);
        System.out.println(vali);
        System.out.println("Age is " + vali.getAge());
        System.out.println("Collect Pay is: " + vali.collectPay());
        vali.retire();
        System.out.println("Joe's Pension check = $" + vali.collectPay());

        HourlyEmployee bia = new HourlyEmployee("Bianca", "01/04/2002",
                "03/03/2021", 25);
        System.out.println(bia);
        System.out.println("Bianca's Paycheck = $" + bia.collectPay());
        System.out.println("Bianca's Holiday Pay = $" + bia.getDoublePay());
    }
}

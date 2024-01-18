package org.example.module7.immutable;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Customer customer = new Customer("Mykola", "555-555-55");
        Invoice invoice = new Invoice(1, BigDecimal.valueOf(1000.0), customer);
        System.out.println("invoice = " + invoice);
        customer.setTel("333-444-55");
        System.out.println("invoice = " + invoice);
        invoice.getCustomer().setTel("111-999-00");
        System.out.println("invoice = " + invoice);

//        Class<?> invoiceClass = invoice.getClass();
//        Field invoiceIdField = invoiceClass.getDeclaredField("id");
//        invoiceIdField.setAccessible(true);
//        invoiceIdField.set(invoice, 5);
//        System.out.println("invoice = " + invoice);

        InvoiceRec invoiceRec = new InvoiceRec(2, BigDecimal.TEN, customer);
        invoiceRec.customer().setTel("5555");
        System.out.println("invoiceRec = " + invoiceRec);

//        Class<?> invoiceClassRec = invoiceRec.getClass();
//        Field invoiceIdFieldRec = invoiceClassRec.getDeclaredField("id");
//        invoiceIdFieldRec.setAccessible(true);
//        invoiceIdFieldRec.set(invoiceRec, 5);
//        System.out.println("invoice = " + invoice);

    }
}

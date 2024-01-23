package org.example.module8;

public class Demo {
    public static void main(String[] args) {
        PdfPage pdfPage = new PdfPage();
        EmailPage emailPage = new EmailPage();

        print(pdfPage);
        print(emailPage);

        pdfPage.send();

        pdfPage.write();

        pdfPage.buildPage();
        emailPage.buildPage();

        System.out.println("PdfPage.maxPageSize = " + PdfPage.MAX_PAGE_SIZE);
//        System.out.println("PdfPage.MAX_PAGE_SIZE = " + PdfPage.MAX_PAGE_SIZE);
//        System.out.println("PdfPage.MAX_PAGE_SIZE = " + Printable.MAX_PAGE_SIZE);

    }

    public static void print(Printable printable) {
        printable.print();
    }
}

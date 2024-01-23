package org.example.module8;

public class PdfPage extends BasePage implements Printable, Sendable {
    public static final int MAX_PAGE_SIZE = 25;
    private int customSize = 50;
    @Override
    public void print() {
        System.out.println("Printing PDF file");
    }

    @Override
    public void send() {
        System.out.println("Sending PDF file");
    }

    @Override
    public void write() {
        System.out.println("Write PDF on screen");
    }
}

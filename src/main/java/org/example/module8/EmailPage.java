package org.example.module8;

public class EmailPage extends BasePage implements Printable {
    @Override
    public void print() {
        System.out.println("Print email");
    }

    @Override
    public void buildPage() {
        System.out.println("Build email template");
    }
}

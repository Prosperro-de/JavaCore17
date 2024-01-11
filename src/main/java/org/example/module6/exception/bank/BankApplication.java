package org.example.module6.exception.bank;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        try {
            account.deposit(100);
        } catch (InvalidTransactionException ex ) {
            System.out.println("Amount should be > 0");
//            ex.printStackTrace();
        } finally {
            System.out.println("Balance= " + account.getBalance());
        }

        try {
            account.withdraw(200);
        } catch (InvalidTransactionException ex) {
            System.out.println("Amount should be less then balance");
//            ex.printStackTrace();
        } finally {
            System.out.println("Balance= " + account.getBalance());

        }

    }
}

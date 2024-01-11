package org.example.module6.exception.bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Amount should be > 0");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InvalidTransactionException("Amount is bigger then balance");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

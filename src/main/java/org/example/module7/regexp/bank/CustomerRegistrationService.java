package org.example.module7.regexp.bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerRegistrationService {
    public static final String EMAIL_REGEX = "[a-z0-9]+@[a-z]{1,10}\\.[a-z]{3,4}";
    public static final String PASSWORD_REGEX = "(?=.*\\d)\\w{8,}";
    private Scanner scanner;

    public CustomerRegistrationService() {
        this.scanner = new Scanner(System.in);
    }

    public Customer registerCustomer() {
        System.out.println("Please enter the email");
        String email = null;
        String password = null;
        try {
            email = scanner.nextLine();
            if (!email.matches(EMAIL_REGEX)) {
                throw new RegistrationValidationException("Please enter valid email");
            }
            System.out.println("Please enter a password");
            password = scanner.nextLine();
            if (!password.matches(PASSWORD_REGEX)) {
                throw new RegistrationValidationException("Password should be min 8 long and contain 1 digit");
            }
        } catch (RegistrationValidationException ex) {
            System.out.println(ex.getMessage());
            registerCustomer();
        }
        return new Customer(email, password);
    }
}

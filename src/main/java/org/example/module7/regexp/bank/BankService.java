package org.example.module7.regexp.bank;

public class BankService {
    private static BankService INSTANCE;
    private Bank bank;
    private CustomerRegistrationService registrationService;

    private BankService() {
        this.bank = new Bank();
        this.registrationService = new CustomerRegistrationService();
    }

    public static BankService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BankService();
        }
        return INSTANCE;
    }

    public void registerCustomer() {
        bank.addCustomer(registrationService.registerCustomer());
    }

    public Customer[] getCustomers() {
        return bank.getCustomers();
    }
}

package model;

import enums.AccountType;

public class SavingsAccount extends Account{
    public SavingsAccount(Employee employee, double balance) {
        super(employee, balance);
    }

    public AccountType getAccountType() {
        return AccountType.SAVINGS;
    }
}

package model;

import enums.AccountType;

public class RetirementAccount extends Account{
    public RetirementAccount(Employee employee, double balance) {
        super(employee, balance);
    }

    public AccountType getAccountType() {
        return AccountType.RETIREMENT;
    }
}

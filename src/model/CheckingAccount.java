package model;

import enums.AccountType;

public class CheckingAccount extends Account{
    public CheckingAccount(Employee employee, double balance) {
        super(employee, balance);
    }
    public AccountType getAccountType() {
        return AccountType.CHECKING;
    }
}

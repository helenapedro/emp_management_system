package model;

import enums.AccountType;

public abstract class Account {
    private final static double DEFAULT_BALANCE = 0.0;
    public double balance;
    private Employee employee;
    private AccountType accType;

    public Account(Employee employee, AccountType accType, double balance) {
        this.employee = employee;
        this.accType = accType;
        this.balance = balance;

    }

    public Account(Employee employee, AccountType accType) {

        this(employee,accType, DEFAULT_BALANCE);
    }

    public abstract AccountType getAccountType();

    public void makeDeposit(double deposit) {
        this.balance = this.balance + deposit;

    }

    public boolean makeWithdrawal(double amount) {
        if (amount > balance) {
            return false;
        }

        this.balance = this.balance - amount;
        return true;
    }

    public String toString() {

        return "type = " + accType + ", balance = " + getBalance();
    }

    public double getBalance() {

        return balance;
    }
    public AccountType getAccType() {
        return accType;
    }

    public Employee getEmployee() {

        return employee;
    }
}

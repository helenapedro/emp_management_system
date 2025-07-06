package model;

import enums.AccountType;

abstract class Account {
    private final static double DEFAULT_BALANCE = 0.0;
    private double balance;
    private Employee employee;

    Account(Employee emp, double balance) {
        employee = emp;
        this.balance = balance;
    }

    Account(Employee emp, String acctType) {
        this(emp, DEFAULT_BALANCE);
    }

    public abstract AccountType getAccType();

    public String toString() {
        return "type = " + ", balance = " + balance;
    }

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
}

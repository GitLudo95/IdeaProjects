package com.company;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 50000.0, "default@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}



package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emial;

    public VipCustomer() {
        this("Default name", 100.00, "Default mail");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknownmail");
    }

    public VipCustomer(String name, double creditLimit, String emial) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emial = emial;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmial() {
        return emial;
    }
}

package com.company;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {

        System.out.println("ana");
    }

    public Account(String number, double balance, String  customerName, String email, String phoneNumber) {
        System.out.println("pozivanje cokstruktora");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

   public void deposit(double depozitAmmount) {
       this.balance += depozitAmmount;
       System.out.println("Deposit of " + depozitAmmount + " made. New balance is "+ this.balance);
   }

   public void withdrowal(double withdrowalAmmount) {
       if (this.balance - withdrowalAmmount < 0) {
           System.out.println("Only " + this.balance + " available. Withdrawal not processed");
       } else {
           this.balance -= withdrowalAmmount;
           System.out.println("Withdrawal of " + withdrowalAmmount + " processed. Ramaining balance = " + this.balance);
       }
   }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
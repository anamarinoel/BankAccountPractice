package com.company;

public class Main {

    public static void main(String[] args) {


//        Account balanceAccount = new Account("1235", 45.2, "ana", "email", "phone: 454676787");
//
//        System.out.println(balanceAccount.getNumber());
//        System.out.println(balanceAccount.getCustomerName());
//
//        balanceAccount.withdrowal(100.0);
//        balanceAccount.deposit(50.0);
//        balanceAccount.withdrowal(100.0);


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Mils", 52.00);
        System.out.println(person3.getEmial());

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	Bankaccount bobsAccount = new Bankaccount("12345", 0.0, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(50.0);
	bobsAccount.withdrawal(100.0);

	bobsAccount.deposit(51.0);
	bobsAccount.withdrawal(100.0);

	VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getCustomerName());

    VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getCustomerName());

    VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(customer3.getCustomerName());
    }
}

package org.example.day2;

public class AccountMain {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.accountNumber = 1111;
        account1.accountBalance = 50000;
        account1.accountName = "Anshu";

        account1.accountDetails();
        Account account2 = new Account();

        account2.accountNumber = 1231;
        account2.accountName = "Neeraj";
        account2.accountBalance = 100000;
        System.out.println("I----------------------------" );

        account2.calculateInterest();


        System.out.println("I----------------------------" );

        account1.calculateInterest();
    }
}

package org.example.day2;

public class AccountMain {
    public static void main(String[] args){
        Account account1 = new Account();
        account1.accountNumber = 1111;
        account1.accountBalance = 50000;
        account1.accountName = "Anshu";

        account1.accountDetails();

        System.out.println("I----------------------------" );
        
        account1.calculateInterest();
    }
}

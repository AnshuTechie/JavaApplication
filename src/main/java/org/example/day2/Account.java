package org.example.day2;

public class Account {


    //create an class account 1. return what u get as input 2. calculate interest on accBalance and return

    int accountNumber;
    String accountName;
    float accountBalance;

    public void accountDetails(){
        System.out.println("AccountNumber is : " + accountNumber);
        System.out.println("AccountName is : " + accountName);
        System.out.println(" AccountBalance is : " + accountBalance);
    }

    public void calculateInterest(){
        float interestAmount;
        float rate = 7.5f;

        interestAmount = accountBalance * (rate/100);
        accountBalance = accountBalance + interestAmount;

        System.out.println("AccountNumber is : " + accountNumber);
        System.out.println("AccountName is : " + accountName);
        System.out.println("Interest Amount is : " + interestAmount);
        System.out.println(" AccountBalance is : " + accountBalance);
    }

}

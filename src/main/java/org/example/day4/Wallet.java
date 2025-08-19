package org.example.day4;

public class Wallet implements PaymentMethod{

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Wallet");
    }
}

class UPI implements PaymentMethod{

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");    }
}

class Paytm implements PaymentMethod{

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Paytm");
    }
}
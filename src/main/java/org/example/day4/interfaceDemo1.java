package org.example.day4;

public class interfaceDemo1 {
    public static void main(String[] args){

        /*We create interfaces to:

Achieve abstraction → Define what needs to be done, not how.
Write flexible and maintainable code → If tomorrow you add a new payment method, you don’t touch existing code, only add a new class.
Support polymorphism → We can use the same reference type (interface) to call methods of different implementations.
Loosely couple the code → Your interfaceDemo1 class doesn’t depend on a specific payment method like Paytm or UPI.

         */
//        PaymentMethod payment = new Paytm();
//        payment.pay(500);
//
//        PaymentMethod paymen = new UPI();
//        paymen.pay(900);


        // or
        PaymentMethod payment;
        payment = new Paytm();
        payment.pay(500);

        payment = new UPI();
        payment.pay(900);

        payment = new Wallet();
        payment.pay(600);

    }
}

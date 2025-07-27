package org.example.day2;

public class ProductMain {
    public static void main(String[] args){
        Product prod = new Product();
//        prod.setProductId(101);
//        prod.setProductName("Dark Chocolate");
//        prod.setProductPrice(200);

        System.out.println(" ProductID = " + prod.getProductId() + "       ProductName = " + prod.getProductName() + "       ProductPrice = " + prod.getProductPrice());
    }
}

/*
 ----------Local Variable--------------------
Declared inside a method, constructor, or block.

Scope: Only within that method/block.

Memory: Created when method is called, destroyed when it ends.

Must be initialized before use.


void show() {
    int localVar = 10; // local variable
    System.out.println(localVar);
}



🔸 ---------------Instance Variable------------------
Declared inside a class, but outside all methods.
Scope: Accessible to all methods of that class.
Each object gets its own copy.
Gets default value if not initialized.


public class Example {
    int instanceVar = 5; // instance variable

    void display() {
        System.out.println(instanceVar);
    }
}
 */


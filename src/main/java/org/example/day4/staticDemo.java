package org.example.day4;

/*
Static members (variables, methods, blocks) belong to the class, not objects.
Static variables are shared among all objects.
Static methods can be called using class name and can only access static members directly.

✅ What Is Happening in This Counter Example?
count is a static variable, meaning it's shared among all instances of Counter.
Every time you create a Counter object, the constructor increments count.
displayCount() is a static method, so it belongs to the class itself and can be called without
an object.

-----How this example satisfies the definition
count is static, so its value is shared across all objects.
Each time a new object is created, count++ increments the same variable.
displayCount() is static, so it’s called using class name Counter.displayCount().
Shows that static members belong to the class, not instances.

🟢 What is static?
static means something belongs to the class, not to each object.
So, all objects share it, and you don’t need to create an object to use it.

✅ What’s the Benefit? (Simple Version)
1. Shared Value for All Objects

Think of a classroom.
Each student (object) can have their own name, own age, etc.
But all students are in the same school — that’s a shared value.

➡Core Benefits of static in Java
static allows you to share data or logic across all objects of a class.
use methods without creating an object, and make your program more efficient and organized
Memory efficiency - Only one instance of the static variable or method is stored in memory

 */

class Counter{
    static int count = 0;
    Counter(){
        count++;
    }

    static void displayCount(){
        System.out.println(" Number of objects created : " + count);
    }
}

public class staticDemo {
    public static void main(String[] args){
        new Counter();
        new Counter();
        Counter.displayCount();
    }
}

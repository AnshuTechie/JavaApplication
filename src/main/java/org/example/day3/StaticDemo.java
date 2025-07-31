package org.example.day3;

public class StaticDemo {
    public static void main(String[] args) {
        // Counter.stCount=100;
        System.out.println(Counter.stCount);
        Counter c1 = new Counter();
        c1.count=21;
        c1.stCount++;
        System.out.println("stCount =" +c1.stCount);
        System.out.println("stCount = " +Counter.stCount);
        Counter  c2 = new Counter();
        c2.count=10;
        c2.stCount++;
        System.out.println("stCount =" +c2.stCount);
        System.out.println("stCount = " +Counter.stCount);
        c1.display();
        Counter.printDetail();


    }
}


class Counter{
    //    public Counter(){
//        System.out.println("default constructor");
//    }
    static int stCount; //class variable -accessible with the classname.membername
    int count; //instance variable - accessible only with the instance

    public void  display(){
        System.out.println("count - instance variable = " +count);
        System.out.println("stCount - static variable = " +stCount);
    }
    public static void  printDetail(){
        System.out.println("stCount- static variable = " +stCount);
        // instance variables are not accessible inside the static method
        // System.out.println("count -instance variable = " +count);
    }
    static{
        //used to initialize the static variables
        System.out.println("static block -it executed only once -one time");
        stCount=800;
    }
}


/*
----------------------- Short Notes -----------------------

1. **Static Variable (Class Variable)**
   - Declared with the `static` keyword.
   - Shared by all objects of the class.
   - Accessed using `ClassName.variableName` or through objects (not recommended).
   - Example: `static int stCount;`

2. **Instance Variable**
   - Declared without `static`.
   - Each object gets its own separate copy.
   - Example: `int count;`

3. **Static Block**
   - Declared as `static { ... }`.
   - Executes only **once** when the class is loaded into memory.
   - Mainly used to initialize static variables.
   - Example:
        static {
            stCount = 800;
        }

4. **Static Method**
   - Can access **only static members** directly.
   - Cannot access instance variables without creating an object.
   - Example: `printDetail()`.

5. **Instance Method**
   - Can access **both static and instance variables** of the class.
   - Example: `display()`.

6. **Static Member Behavior**
   - Shared across all objects.
   - Incrementing `stCount` from any object reflects in all objects.

------------------- Execution Flow ------------------------
1. Static block executes first (initializes stCount = 800).
2. `main()` executes and accesses static variable using `Counter.stCount`.
3. Objects `c1` and `c2` manipulate `stCount` (shared) and `count` (separate).
4. Static methods can be called using the class name without creating an object.

*/

package org.example.AccessModifier;

/*

Access modifiers control visibility of variables, methods, and classes.

Modifier	        Within Class	Within Package	Subclass (Other Package)	Everywhere
private	                ✅ Yes	    ❌ No	            ❌ No	                ❌ No
default (no keyword)	✅ Yes	    ✅ Yes	            ❌ No	                ❌ No
protected	            ✅ Yes	    ✅ Yes	            ✅ Yes	                ❌ No
public	                ✅ Yes	    ✅ Yes	            ✅ Yes	                ✅ Yes

 */


public class AccessModifier {
    private int a = 10;       // only inside class
    int b = 20;               // default - package level
    protected int c = 30;     // accessible to subclasses
    public int d = 40;        // accessible everywhere

    public void show() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

// Class with main method to test access
class TestAccessModifier {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.show();  // Output: 10 20 30 40

        // Direct access to variables
        //System.out.println(obj.a); // ❌ private - not accessible(class)
        System.out.println(obj.b); // ✅ default - accessible in same (package + class)
        System.out.println(obj.c); // ✅ protected - accessible in same (package+class+subpackage)
        System.out.println(obj.d); // ✅ public - accessible everywhere
    }
}


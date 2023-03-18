package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {

    // Step 4
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {

    public static void main(String[] args) {
// Step 3
        A obj1 = new A();
        System.out.println(obj1.meth());

// Step 5
        B obj2 = new B();
        System.out.println(obj2.meth());
    }
}
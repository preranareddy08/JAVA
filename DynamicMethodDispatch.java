/*
  -Dynamic Method Dispatch is a key feature of Java's runtime polymorphism. It allows the JVM (Java Virtual Machine) 
to decide which method implementation to call at runtime based on the actual object type (not the reference type). 

 **Key Points to Remember
  -Upcasting is Required: The reference variable of the parent class must refer to an object of the child class.
  -Only Overridden Methods are Dispatched: Dynamic method dispatch works only for overridden methods,
   not for new methods in the child class.
  -Compile-Time vs Runtime:At compile time, the method call is checked based on the reference type.
                           At runtime, the method call is resolved based on the actual object type.
 */
class A {

    public void show() {
        System.out.println("in A");
    }
}

class B extends A {

    public void show() {
        System.out.println("in B");
    }
}

class C extends A {

    public void show() {
        System.out.println("in C");
    }
}

class DynamicMethodDispatch {

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        obj1 = new B();
        obj1.show();

        obj1 = new C();
        obj1.show();

    }
}

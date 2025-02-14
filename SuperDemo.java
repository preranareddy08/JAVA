//Object class is the ultimate  parent of all classes
/*
1.Refers to Parent Class: The super keyword is used to refer to the immediate parent class of a subclass.
2.Access Parent Class Members:
  -It can be used to access parent class fields (variables) and methods that are overridden in the subclass.
  -Example: super.methodName() or super.variableName.
3.Call Parent Class Constructor:
  -super() is used to call the constructor of the parent class.
  -It must be the first statement in the subclass constructor if used.
  -Example: super(); or super(parameters);.
4.Cannot Be Used in Static Context:
  -The super keyword cannot be used in a static context (e.g., static methods or static blocks).
NOTE: this() will call the cnstructor of same class.
 */

class A {

    public A() {
        //super() by default it is present
        System.out.println("in A");
    }

    public A(int n) {
        //super();
        this();
        System.out.println("in A int");
    }
}

class B extends A {

    public B() {
        //super() by default it is present

        System.out.println("in B");
    }

    public B(int n) {
        //super()
        super(n);//need to explicitly mention if a parameterized constructor need to be called of a parent class.

        System.out.println("in B int");
    }
}

class SuperDemo {

    public static void main(String[] args) {
        B b1 = new B(10);
        A a1 = new A(3);
        B b2 = new B();
    }
}

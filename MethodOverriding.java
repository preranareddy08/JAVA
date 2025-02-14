/*
**Method overriding is the basis for runtime polymorphism (dynamic method dispatch).
  -Method overriding is a key feature of object-oriented programming (OOP) in Java
that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
  -The overridden method in the subclass must have the same name, return type, and parameters as the method in the superclass.
  -The access level of the overridden method in the subclass cannot be more restrictive than the method in the superclass.
For example, if the superclass method is protected, the subclass method can be protected or public but not private.
1. Static Methods Cannot Be Overridden
  -Static methods belong to the class, not the instance, so they cannot be overridden.
  -If a subclass defines a static method with the same signature as a static method in the superclass, 
it is called method hiding, not overriding.
2.Final methods, private methods cannot be overridden
class Calc {

    int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {

    int add(int a, int b) {
        return a + b + 1;
    }
}

class MethodOverriding {

    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(3, 4));
        AdvCalc a = new AdvCalc();
        System.out.println(a.add(3, 4));

    }
 }

//MULTI-LEVEL INHERITANCE
/*
  -Inheritance is a fundamental concept in object-oriented programming (OOP) 
that allows one class to inherit properties and behaviors (methods and fields) from another class.
  -In Java, inheritance is implemented using the extends keyword.
  -Java does not support Multiple Inheritance (a class inheriting from multiple superclasses) 
  directly through classes to avoid complexity and ambiguity (diamond problem). However, it can be achieved using interfaces.
1. Access Modifiers and Inheritance
  -Private members of the superclass are not accessible in the subclass.
  -Public and protected members are accessible in the subclass.
  -Default (package-private) members are accessible only if the subclass is in the same package as the superclass.
2.Final Classes and Methods
  -A final class cannot be inherited.
  -A final method cannot be overridden in the subclass.  


 */
class Calc {  //parent class

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

}

class AdvCalc extends Calc { //child of Calc and parent of VeryAdvCalc 

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

class VeryAdvCalc extends AdvCalc { //child of AdvCalc

    double power(int a, int b) {
        return Math.pow(a, b);
    }
}

class InheritanceDemo {

    public static void main(String[] args) {
        VeryAdvCalc v1 = new VeryAdvCalc();
        System.out.println(v1.add(1, 2) + " " + v1.sub(4, 3) + " " + v1.mul(3, 4) + " " + v1.div(4, 2) + " " + v1.power(2, 2));
    }
}

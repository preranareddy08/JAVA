/*
 Method Overloading in Java is a feature that allows a class to have more than one method with the same name,
 but with different parameters. It is a way to achieve compile-time polymorphism in Java.

 Key Points about Method Overloading:

Same Method Name: The methods must have the same name.

Different Parameters: The methods must have different parameter lists. This can be achieved by:

   -Changing the number of parameters.

   -Changing the data types of parameters.

    -Changing the order of parameters (if the types are different).

Return Type: The return type of the methods can be the same or different, but it does not contribute to method overloading. Overloading is based solely on the method signature (name + parameters).

Compile-Time Decision: The method to be called is decided at compile time based on the arguments passed.



 */
public class Demo {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class Methodoverloading {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        System.out.println(d1.add(3, 4));
        System.out.println(d1.add(1, 2, 3));
        System.out.println(d1.add("2", "3"));

    }
}

/*
Why Use Method Overloading?

-Improves code readability by using the same method name for similar operations.

-Provides flexibility to call the same method with different inputs.

-Reduces the need for multiple method names for similar functionality.


 */

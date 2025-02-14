/*final - variables, class, method.
1. Final Variables
  -A final variable is a constant; its value cannot be changed once assigned.
  -It must be initialized either at the time of declaration or in the constructor (for instance variables).
  -A final variable that is not initialized at the time of declaration is called a blank final variable.
2. Final Methods
  -A final method cannot be overridden by subclasses.
  -It is used to prevent modification of the method's behavior in derived classes.
3. Final Classes
  -A final class cannot be inherited (extended).
  -It is used to prevent inheritance and ensure the class cannot be subclassed.
4. Final Parameters
  -A final parameter in a method cannot be modified inside the method.
  -It ensures that the parameter value remains constant within the method.
5. Final and Static
  -A static final variable is a compile-time constant.
  -It is shared across all instances of the class and cannot be changed.

 */
final class A {

    final int value = 10;

    final public void show() {
        System.out.println("in class A");
    }

    public int add(final int a, int b) {
        return a + b;
    }
}

class B extends A {

    public void show() {
        System.out.println("in class B");
    }

    public int add(int a, int b) {
        return a + b;
    }

}

class FinalKeyword {

    public static void main(String[] args) {
        A a1 = new A();
        a1.show();
        B b1 = new B();
        b1.show();

    }
}

/*
  -Annotations in Java are a form of metadata that provide data about a program but are not part of the program itself. 
They do not directly affect the code they annotate, but they can be used by the compiler,development tools, 
or runtime environments to influence behavior, generate code, or provide additional information.
  -Annotations can provide hints to the compiler, such as @Override to indicate that a method is intended to override a superclass method,
   or @Deprecated to mark a method or class as obsolete.
  -@SuppressWarnings:Suppresses specific compiler warnings. 
For example, @SuppressWarnings("unchecked") suppresses warnings related to unchecked type casts.
  -@FunctionalInterface:Indicates that an interface is intended to be a functional interface 
(an interface with exactly one abstract method). The compiler will enforce this.
  -@SafeVarargs:Suppresses warnings related to varargs (variable-length arguments) when generics are used.
 */
class A {

    public void showMeTheDataThatBelongsToThisClass() {
        System.out.println("in show A");
    }
}

class B extends A {

    @Override
    public void showMeTheDataThatBelongsToThisClass() {
        System.out.println("in show B");
    }

}

class Annotations {

    public static void main(String[] args) {
        A obj = new B();
        obj.showMeTheDataThatBelongsToThisClass();
    }
}

/*

class->class :entends
interface->interface :extends
class->interfaces :implements

  -variables in an interface are by default final and static
  -methods in an interface are by default public and abstract
  -An interface is a reference type in Java 
that contains abstract methods (methods without a body) and constants (static final variables).
  -No Constructors: Interfaces cannot have constructors because they cannot be instantiated directly.
  -No Instance Fields: Interfaces cannot have instance variables.
1.Functional Interfaces (Java 8+)
  -A functional interface is an interface with exactly one abstract method.
  -It can have multiple default or static methods.
*/
interface A{
    int a = 10;
    String name = "kitty";
    void show();
    void config();
}
interface X{
    void music();
}
interface Y extends X{
    void music1();
}
class B implements A,Y{
    public void show()
    {
        System.out.println("in B");
    }
    public void config()
    {
        System.out.println("configuring in B");
    }
    public void music()
    {
        System.out.println("music playing");
    }
    public void music1()
    {
        System.out.println("music-1 playing");
    }
}
class Interfaces{
    public static void main(String args[])
    {
        A obj = new B();
        X obj1 = new B();
        Y obj2 = new B();
        obj.show();
        obj.config();
        obj1.music();
        obj2.music1();
        obj2.music();
        System.out.println(A.a);
        System.out.println(A.name);
    }
}
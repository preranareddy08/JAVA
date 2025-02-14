/*
  -Abstraction is a fundamental concept in object-oriented programming (OOP)
that allows you to hide the implementation details and show only the necessary features of an object.
  -In Java, abstraction is achieved using abstract classes and interfaces. 
2. Abstract Classes
  -An abstract class is declared using the abstract keyword.
  -It cannot be instantiated (you cannot create objects of an abstract class).
  -It can contain:
     *Abstract methods: Methods without a body (only declaration).
     *Concrete methods: Methods with a body (implementation).
3. Rules for Abstraction in Java
  -A class must be declared abstract if it contains at least one abstract method.
  -Abstract methods cannot be declared as private or final.
  -A subclass must override all abstract methods of its superclass unless the subclass is also abstract.
  -Interfaces cannot have constructors, but abstract classes can.
*/
abstract class Car{  //abstract class
    abstract public void drive();
    abstract public void fly();
    public void playmusic() //non-abstract method
    {
       System.out.println("music playing");
    }
}
abstract class Benz extends Car{  //abstract class
    public void drive()
    {
        System.out.println("driving");
    }
}
class AdvBenz extends Benz{  //concrete class
    public void fly()
    {
        System.out.println("flying");
    }
}
class AbstractionDemo{
    public static void main(String args[])
    {
        Car c = new AdvBenz();
        AdvBenz a = new AdvBenz();
        c.drive();
        c.fly();
        c.playmusic();

        a.playmusic();
        a.drive();
        a.fly();
    }
}

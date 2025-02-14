/*
1. Constructor Chaining:
Definition:
  -Constructor chaining is the process of calling one constructor from another constructor within the same class or from a parent class.
  -It is used to reuse constructor code and avoid redundancy.
Purpose:
  -To initialize an object in multiple ways by reusing constructors.
  -To ensure that common initialization logic is centralized.
How It Works:
  -Use this() to call another constructor in the same class.
  -Use super() to call a constructor in the parent class.

2. Copy Constructor:
Definition:
  -A copy constructor is a special constructor that takes an object of the same class as a parameter and creates a new object as a copy of the passed object.
  -It is used to create a new object with the same state as an existing object.
Purpose:
  -To create a copy of an existing object.
  -To ensure that the new object is independent of the original object (especially for deep copying).
How It Works:
  -Define a constructor that accepts an object of the same class as a parameter.
  -Copy the values of the fields from the passed object to the new object.

3. Constructor Overloading:
  -Defining multiple constructors with different parameter lists.
  -Allows objects to be initialized in different ways.

*. Important Points:
  -A class can have multiple constructors (constructor overloading).
  -If no constructor is defined, Java provides a default constructor.
  -Constructors cannot be abstract, static, final, or synchronized.
  -Constructors can throw exceptions.
  -Constructors are not inherited by subclasses, but the subclass constructor must call a superclass constructor (using super()).
 */
class Human {

    String name;
    int age;

    public Human() //deafult constructor
    {
        name = "pinky";
        age = 40;
    }

    public Human(String name, int age) {  //parameterized constructor
        this.name = name;
        this.age = age;
    }

    public Human(String name) { //constructor chaining
        this(name, 0);

    }

    public Human(Human h) { //copy constructor
        this.name = h.name;
        this.age = h.age;
    }

    void show() {
        System.out.println("name: " + name + " " + "age: " + age);
    }
}

class ConstructorDemo {

    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("mikky", 20);
        Human h3 = new Human("chotu");
        Human h4 = new Human(h2);
        h1.show();
        h2.show();
        h3.show();
        h4.show();

    }
}

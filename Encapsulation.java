/*
1. Definition:
   -Encapsulation is the mechanism of wrapping data (variables) and code (methods) together as a single unit.
   -It also involves restricting direct access to some of an object's components, which is achieved using access modifiers.
2. Key Features:
   -Data Hiding: Protects the internal state of an object by making fields private and providing public methods to access and modify them.
   -Controlled Access: Allows controlled access to the data through getter and setter methods.
   -Increased Security: Prevents unauthorized access and modification of data.
3.Why this keyword is used?
   -When the name of a parameter (e.g., in a constructor or method) is the same as the name of an instance variable, 
   the this keyword is used to refer to the instance variable.
 */
class Human {

    private String name;
    private int age;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getage() {
        return age;
    }

}

class Encapsulation {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setname("prerana reddy");
        h1.setage(20);
        System.out.println("name: " + h1.getname() + " " + "age: " + h1.getage());
    }
}

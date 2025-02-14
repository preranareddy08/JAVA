
class Demo {

    int a = 10;

    public void display() {
        System.out.println("Instance Variable:" + a);
    }
}

public class InstanceVariable {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.display();
        d2.display();

        d1.a = 20; //changing the instance variable of first obj

        d1.display();
        d2.display();

        d2.a = 100;//changing the instance variable of second obj

        d1.display();
        d2.display();

    }
}
/*
   Instance variables: Changes are specific to the object being modified.
 */

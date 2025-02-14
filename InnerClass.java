 /*
   -Inner classes in Java are a powerful feature that allows you to define a class within another class.
*There are four types of inner classes in Java:
1.Non-static (or Regular) Inner Class
  -A non-static inner class is associated with an instance of the outer class.
  -It can access all members (fields and methods) of the outer class, including private members.
  -To create an instance of a non-static inner class, you must first create an instance of the outer class.
2.Static Nested Class
  -A static nested class is a static member of the outer class.
  -It does not have access to the instance members of the outer class (only static members).
  -It can be instantiated without creating an instance of the outer class.
3.Local Inner Class:
  -A local inner class is defined inside a block, such as a method or a scope block.
  -It can only access final or effectively final local variables of the enclosing block.
  -It is not accessible outside the block in which it is defined.
4.Anonymous Inner Class
 */
 class A{
    public void show()
    {
        System.out.println("in class A");
    }
    class B{
        public void show1()
        {
            System.out.println("in class B");
        }
    }
 }
 class InnerClass{
    public static void main(String args[])
    {
        A a1 = new A();
        a1.show();
        A.B b1 = a1.new B();
       // A.B b1 = new A.B();//if inner class is static
        b1.show1();
       
    }
 }
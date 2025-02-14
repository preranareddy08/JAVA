/*
  -An anonymous inner class is a class without a name that is defined and instantiated in a single expression.
  -It is used to provide an implementation for an interface or an abstract class on the fly.


*/
abstract class A{
    public abstract void show();
    public abstract void config();
}
class AnonymousInnerClass{
    public static void main(String args[])
    {
        A obj = new A()
        {
           public void show()
            {
                System.out.println("in new A");
            }
           public void config()
            {
                System.out.println("new config A");
            }
        };
        obj.show();
        obj.config();
    }
}
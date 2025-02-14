/*
  -In Java, the throws keyword is used in method signatures to indicate that the method might throw one or more exceptions.
  -It is a way to delegate the responsibility of handling exceptions to the caller of the method. 
  -The caller must either handle these exceptions using a try-catch block or declare them using throws in their own method signature.
  -throws is primarily used for checked exceptions (exceptions that are checked at compile time, e.g., IOException, SQLException).
  -A method can declare multiple exceptions separated by commas.
  -If a method in a subclass overrides a method in a superclass,
   the subclass method cannot declare more exceptions than the superclass method.
   It can declare the same or fewer exceptions.


*/
class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Demo");
    }
}
class ThrowsDemo{
    static{
        System.out.println("class loaded");
    }
    public static void main(String args[])
    {
        A obj = new A();
        
        
        try{
            obj.show();
        }
        catch(ClassNotFoundException e)
        {
           // e.printStackTrace();
           System.out.println(e);
        }
    }
}
/*
 -By default when we try to print the object say a1,we get string converted class name and the price value in hashcode.
 -If we eplicitly write toString() method inside a class,it return values that are assigned in a string converted format.

*/
class Laptop{
    String model;
    int price;
    public String toString()
    {
        return model+" "+price;
    }
   public boolean equals(Laptop that)
    {
        return this.model.equals(that.model) && this.price==that.price;

    }
}
class ObjectClassDemo{
    public static void main(String args[])
    {
        Laptop a1 = new Laptop();
        a1.model = "lenovo";
        a1.price = 20000;
        Laptop a2 = new Laptop();
        a2.model = "lenovo";
        a2.price = 20000;
        System.out.println(a1.toString());
        //TO compare if two objects are equal or not
        System.out.println(a1.equals(a2));
    }
}
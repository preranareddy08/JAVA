class A{
    public void show1()
    {
        System.out.println("in A");
    }
}
class B extends A{
    public void show2()
    {
        System.out.println("in B");
    }
}
class UpcastingDowncasting{
    public static void main(String args[])
    {
        A a1 = new B(); //UPCASTING:parent <--child    //implicit conversion 
        a1.show1();
        B b1 = (B)a1; //DOWNCASTING: child <-- parent
        b1.show2();
        b1.show1();

        
    }
}
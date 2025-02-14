interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code compile run");
    }
}
class Desktop implements Computer{
    public void code()
    {
        System.out.println("desktop code running");
    }
}
class Developer {
    public void devApp(Computer lap)
    {
       lap.code();
    }
}
class InterfacesDemo2{
    public static void main(String args[])
    {
        Laptop l = new Laptop();
        Desktop d = new Desktop();
        Developer dp = new Developer();
       // dp.devApp(l);
        //dp.devApp(d); //error
        //this gives an error beacuse the method in class Developer only refers to laptop hence it cannot refer to desktop
        //how to resolve? create superclass which implements laptop and desktop and such that we can refer to any of the subclasses for loose coupling and flexibility
        Computer c1 = new Laptop();
        Computer c2 = new Desktop();
        dp.devApp(c1);
        dp.devApp(c2);
    }
}
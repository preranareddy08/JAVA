/*
1.Static Methods:
  -Belong to the class, not to any instance.
  -Can only access static variables and call other static methods.
  -To access non-static variables ,we need to pass an object reference
  -Cannot use this or super.
  -Commonly used for utility functions.
 */
class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("brand:" + brand + " " + "price:" + price + " " + "name:" + name);
    }

    public static void show1(Mobile m) {
        System.out.println("brand:" + m.brand + " " + "price:" + m.price + " " + "name:" + m.name);
    }
}

class StaticMethodDemo {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand = "samsung";
        m1.price = 10000;
        Mobile.name = "smartphone";

        m2.brand = "vivo";
        m2.price = 30000;
        Mobile.name = "smartphone";

        Mobile.name = "rgukt phone";
        //Mobile.show1(); //throws error since show() contains non-static variables too that cannot be regerences to any particular object
        Mobile.show1(m1);

    }
}

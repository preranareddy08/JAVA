/*
1.Class-Level Member:
  -The static keyword is used to define class-level members
   (variables, methods, blocks, and nested classes) that belong to the class itself, not to any specific instance.
2.Static Variables:
   -Shared across all instances of the class.
   -Initialized only once when the class is loaded.
   -Accessed using the class name (e.g., ClassName.variableName).
   -Non-static methods can use static variables.
3.Memory Efficiency:
   -Static members are stored in a fixed memory location (method area) and shared across all instances.
 */
class Mobile {

    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("brand:" + brand + " " + "price:" + price + " " + "name:" + name);
    }
}

class StaticKeywordDemo {

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

        m1.show();
        m2.show();

    }
}

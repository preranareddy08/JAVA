/*
  1.Purpose of Static Block:
    -Used to initialize static variables or perform one-time setup tasks for the class.
    -Executed only once when the class is loaded into memory, before any objects are created or any static methods are called.
  2. Execution Order:
    -Static blocks are executed in the order they appear in the class.
    -They are executed before the main method (if present) and before any instance of the class is created.
  3. Multiple Static Blocks:
    -A class can have multiple static blocks.
    -They are executed in the order they are defined.
 */
class Mobile {

    String brand;
    int price;
    static String name;

    static {
        name = "prerana";
        System.out.println("static block called ");
    }

    public Mobile() {
        brand = "oppo";
        price = 50000;

    }

    public void show() {
        System.out.println("brand:" + brand + " " + "price:" + price + " " + "name:" + name);
    }
}

class StaticBlockDemo {

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand = "samsung";
        m1.price = 10000;

        m1.show();
        m2.show();

    }
}

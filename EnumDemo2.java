
enum Laptop {
    Macbook(2000), XPS(1000), Dell(), Thinkpad(4000); //these are all objects

    private int price;

    private Laptop() { //default constructor:used when no price is passed as argument
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    void setprice(int p) {
        price = p;
    }

    int getprice() {
        return price;
    }
}

class EnumDemo2 {

    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap);
        //TO PRINT ALL LAPTOPS WITH CORRESPONDING PRICES
        for (Laptop lp : Laptop.values()) {
            System.out.println(lp + " " + lp.getprice());
        }
    }
}

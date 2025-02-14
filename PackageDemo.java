/*
**Access Modifiers and Packages
  -public: Accessible from any package.
  -protected: Accessible within the same package and by subclasses.
  -Default (no modifier): Accessible only within the same package.
  -private: Accessible only within the same class.
 */
import c.AdvCalc;
//import c.Calc;

class PackageDemo {

    public static void main(String[] args) {
        // Calc c = new Calc();
        // System.out.println(c.add(1, 2));
        AdvCalc a = new AdvCalc();
        System.out.println(a.mul(2, 3));
        System.out.println(a.add(1, 2));

    }
}

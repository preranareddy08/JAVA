
interface A {

    int add(int x, int y);
}

/*
class LambdaExpressionsDemo2 {

    public static void main(String[] args) {
        A obj = new A{
          public int add(int x, int y)
            {
            return x+y;
            }
        };
        System.out.println(obj.add(2,3));
    }
}
 */
class LambdaExpressionsDemo2 {

    public static void main(String[] args) {
        A obj = (x, y) -> x + y;
        System.out.println(obj.add(2, 3));
    }
}

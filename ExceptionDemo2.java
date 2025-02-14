
class ExceptionDemo2 {

    public static void main(String[] args) {
        int i = 2;
        int j = 10;
        int num[] = new int[5];
        String s = "abc";
        try {
            j = 14 / i;
            System.out.println(s.length());
            System.out.println(num[5]);

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        } catch (Exception e) { //parent exception should always be after child exceptions
            System.out.println(e);
        }
    }
}

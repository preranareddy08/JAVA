
class MyException extends Exception {

    public MyException(String s) {
        super(s);
    }
}

class ExceptionCustomDemo4 {

    public static void main(String[] args) {
        int i = 16;
        int j = 12;
        try {
            j = 14 / i;
            if (j == 0) {
                throw new MyException("cannot divide by zero");
            }

        } catch (MyException e) {
            j = 14 / 2;
            System.out.println("default output" + e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


class ExceptionThrowDemo3 {

    public static void main(String[] args) {
        int i = 16;
        int j = 0;
        try {
            j = 12 / i;
            if (j == 0) {
                throw new Error("donot divide by zero");
            }

        } catch (Error e) {
            j = 12 / i;
            System.out.println("default output" + " " + e);
        }
        System.out.println(j);
    }
}

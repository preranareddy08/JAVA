/*
  -In Java, the finally block is used in conjunction with a try-catch block 
to ensure that a piece of code is executed regardless of whether an exception is thrown or not.
The finally block is typically used for cleanup activities, such as closing files,
releasing resources, or any other operations that need to be performed no matter what happens in the try block.

**Key Points about finally:
  -Always Executed: The finally block is always executed, whether an exception is thrown or not. The only exceptions are:
     ->If the JVM exits (e.g., System.exit() is called).
     ->If the thread executing the try or catch block is interrupted or killed.
 */
class FinallyDemo {

    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("exception caught" + e);
        } finally {
            System.out.println("completed");
        }
    }
}

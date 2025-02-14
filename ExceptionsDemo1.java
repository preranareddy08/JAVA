/* TYPES OF ERRORS
1.Compile-Time Errors (Syntax Errors):
  -These errors occur when the code violates the syntax rules of the Java language.
   The compiler detects these errors during the compilation process and prevents the code from being compiled until the errors are fixed.
     *Examples:
       -Missing semicolons
       -Incorrect variable declarations
       -Mismatched parentheses or braces
       -Using undeclared variables
2.Runtime Errors (Exceptions):
   -These errors occur during the execution of the program.
    They are not detected by the compiler and can cause the program to crash or behave unexpectedly.
     *Examples:
        -Division by zero
        - Accessing an array index out of bounds
        -Null pointer exceptions
        -Type casting errors
3.Logical Errors:
  -These errors occur when the program compiles and runs successfully, but it does not produce the expected output due to incorrect logic or algorithm.
    *Examples:
       -Incorrect calculations
       -Infinite loops
       -Incorrect conditional statements
 */
class ExceptionsDemo1 {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        try {
            j = 14 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
        System.out.println(j);
    }
}

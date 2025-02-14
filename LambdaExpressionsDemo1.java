/*
  -Lambda expressions are a powerful feature introduced in Java 8 that allow you to write concise and functional-style code.
  -They are particularly useful for working with functional interfaces (interfaces with a single abstract method).
1.Syntax of Lambda Expressions
  *A lambda expression consists of:
     -A parameter list: (parameters)
     -An arrow token: ->
     -A body: { expression or statements }
 */
@FunctionalInterface
interface A {

    void show();
}

/*
class LambdaExpressions {

    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in class A");
            }
        };
        obj.show();
    }
}
 */
class LambdaExpressionsDemo1 {

    public static void main(String[] args) {
        A obj = () -> System.out.println("in class A");
        obj.show();
    }
}

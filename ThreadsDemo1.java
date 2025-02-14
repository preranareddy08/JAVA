/*
  -In Java, threads are a fundamental concept used to achieve multithreading, 
which allows a program to perform multiple tasks concurrently. 
  -Threads enable you to execute multiple operations simultaneously, making your programs more efficient and responsive,
especially for tasks like handling user input, performing background operations, or managing multiple connections in a server.
  -A thread is a lightweight subprocess that represents an independent path of execution within a program.
  -Every Java program has at least one thread, called the main thread, which is created automatically when the program starts.


 */
class A extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10); //we are asling this thread to wait for 10ms ,as it can throw Interrupted exception we are using try-catch
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadsDemo1 {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        try {
            obj1.sleep(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        obj2.start();
        obj2.setPriority(Thread.MAX_PRIORITY); //suggesting the scheduler to give maxpriority to obj2 but it does what is wishes

    }
}

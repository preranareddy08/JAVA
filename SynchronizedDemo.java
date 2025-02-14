/*
  -Counter is a resource which is shared by 2 threads t1 and t2.
  -In Java, synchronized and join() are used to manage thread behavior,
   particularly in scenarios involving concurrency and thread coordination.
1. synchronized Keyword
  -The synchronized keyword is used to control access to shared resources in a multi-threaded environment.
 It ensures that only one thread can execute a block of code or method at a time, preventing race conditions and ensuring thread safety.
 **Key Points:
   -synchronized ensures mutual exclusion.
   -It uses an intrinsic lock (monitor) associated with the object or class.
   -Overuse of synchronized can lead to performance bottlenecks due to thread contention.
2. join() Method
  -The join() method is used to make one thread wait for the completion of another thread. 
  -It ensures that the current thread pauses execution until the thread it is joining with finishes.
  **Why is join() used?
  -Thread Coordination: It is used when one thread depends on the result or completion of another thread.
  -Sequential Execution: It ensures that threads execute in a specific order, even though they are inherently asynchronous.
 */
class Counter {

    int count;

    public synchronized void increment() {
        count++;
    }
}

class SynchronizedDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();//here t1 thread starts and increments count by 1
        t2.start();//here t2 thread starts and incerements count by 1

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}

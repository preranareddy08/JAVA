/*
  -Java Streams API (introduced in Java 8) 
  -Allows functional-style operations on collections, making data processing more efficient and readable.
  1. Streams Process Data Lazily
   -Intermediate operations (e.g., filter(), map()) are lazy, meaning they are executed only when a terminal operation 
    (e.g., collect(), forEach()) is invoked.
2. Streams Do Not Store Data
   -Unlike collections, a stream does not store elements; it processes data on demand.
3. Streams Are Immutable
   -Stream operations do not modify the original data source but produce a new stream with transformed elements.
4. Streams Can Be Sequential or Parallel
   -By default, streams are sequential (stream()).
   -Parallel processing can be enabled using parallelStream(), allowing faster execution on multi-core processors.
5. Streams Have Intermediate and Terminal Operations
   -Intermediate Operations (Lazy)
     map(), filter(), sorted(), distinct(), limit()
   -Terminal Operations (Eager)
     collect(), forEach(), reduce(), count()
 */
import java.util.*;
import java.util.stream.Stream;

class StreamDemo {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 5, 3, 4);
        int s = nums.stream()
                .filter(n -> n % 2 == 0) //filtering the array
                .map(n -> n * 2) //making changes for each element
                .reduce(0, (c, d) -> c + d); //0:initial value ,taking c,d and adding them
        System.out.println(s);

        //TO PRINT ONLY ODD NUMBERS
        Stream<Integer> s1 = nums.stream()
                .filter(n -> n % 2 != 0);
        s1.forEach(n -> System.out.println(n));

        //SORTING
        Stream<Integer> s2 = nums.stream()
                .sorted();
        s2.forEach(n -> System.out.println(n));

    }
}

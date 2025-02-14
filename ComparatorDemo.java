/*
  -In Java, the Comparator interface is used to define a custom ordering for objects.
  It is particularly useful when you want to sort or compare objects that do not naturally implement the Comparable interface or 
  when you need to sort objects in a different order than their natural ordering.
 */
import java.util.*;

class ComparatorDemo {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(32);
        nums.add(90);
        nums.add(23);
        //sorting based on second digit in a number
        Comparator<Integer> conn = (Integer i, Integer j)
                -> {
            if (i % 10 > j % 10) {
                return 1;
            } else {
                return -1;
            }
        };
        Collections.sort(nums, conn);
        System.out.println(nums);

    }
}

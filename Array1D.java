
/*
-In Java, arrays are objects. They are dynamically allocated in the heap memory.

*Default Values
If an array is declared but not initialized, its elements are assigned default values:

    -0 for numeric types (int, double, etc.).

    -false for boolean.

    -null for objects (e.g., String, custom classes).
 */
import java.util.*;

class Array1D {

    public static void main(String[] args) {
        int arr1[] = new int[3]; //dynamic initialization
        int arr2[] = {1, 2, 3}; //static initialization
        int arr3[] = {34, -2, 32, 100, 56, 43, 89};
        int arr4[] = new int[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = (int) (Math.random() * 100);
            System.out.println("random val:" + arr1[i]);
        }
        //PRINTING ARRAY-1
        System.out.println("PRINTING ARRAY-1");
        for (int i = 0; i < 3; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //PRINTING ARRAY-2
        System.out.println("PRINTING ARRAY-2");

        for (int it : arr2) {
            System.out.print(it + " ");
        }
        System.out.println();

        //SEARCHING IN AN ARRAY
        int ind = Arrays.binarySearch(arr3, 100);
        System.out.println("SEARCHING ARRAY");
        System.out.println("element is found at index:" + ind);

        System.out.println();

        //SORTING THE ARRAY
        Arrays.sort(arr3);
        System.out.println("SORTING ARRRAY-3");
        for (int it : arr3) {
            System.out.print(it + " ");
        }

        System.out.println();

        //COPYING ARRAYS
        System.arraycopy(arr1, 0, arr4, 0, arr1.length);
        System.out.println("COPYING ARRAY USING arraycopy");
        for (int num : arr4) {
            System.out.print(num + " ");
        }
        System.out.println();
        int arr5[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println("COPYING ARRAY USING Arrays.copyOf");
        for (int num : arr5) {
            System.out.print(num + " ");
        }

    }
}

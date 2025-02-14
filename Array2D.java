
import java.util.Arrays;


/*
-In Java, 2D arrays are objects. They are dynamically allocated in the heap memory.
* Default Values
If a 2D array is declared but not initialized, its elements are assigned default values:

    -0 for numeric types (int, double, etc.).

    -false for boolean.

    -null for objects (e.g., String, custom classes).
 */
class Array2D {

    public static void main(String[] args) {
        int arr1[][] = new int[3][4]; //dynamic
        int arr2[][] = {{1, 3, 5, 7, 8}, //static
        {5, 7, 9, 5, 4},
        {1, 2, 3, 4, 5}};
        int n = arr1.length;
        int m = arr1[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Output for array1");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Output for array2");

        for (int row[] : arr2) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        //SORTING 2D ARRAY
        for (int row[] : arr2) {
            Arrays.sort(row);
        }
        System.out.println("After sorting");

        for (int row[] : arr2) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}

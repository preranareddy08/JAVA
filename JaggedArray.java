/*
A jagged array is a 2D array where each row can have a different number of columns.

 */
class JaggedArray {

    public static void main(String[] args) {
        // Declaring a jagged array with 3 rows
        int[][] jaggedArray = new int[3][];

        // Initializing different column sizes for each row
        jaggedArray[0] = new int[2]; // Row 0 has 2 columns
        jaggedArray[1] = new int[4]; // Row 1 has 4 columns
        jaggedArray[2] = new int[3]; // Row 2 has 3 columns

        // Assigning values
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 100);
            }
        }

        // Printing the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

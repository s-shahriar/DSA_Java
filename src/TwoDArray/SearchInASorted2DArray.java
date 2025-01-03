package TwoDArray;

public class SearchInASorted2DArray {

    public static boolean searchInArray(int[][] matrix, int target) {
        int rows = 0;
        int cols = matrix[0].length - 1;

        while (rows < matrix.length && cols >= 0) {
            if (matrix[rows][cols] == target) {
                System.out.println("Found at: (" + rows + ", " + cols + ")");
                return true;
            } else if (target < matrix[rows][cols]) {
                // Go left
                cols--;
            } else {
                // Go down
                rows++;
            }
        }

        System.out.println("Target not found.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 6;

        boolean ans = searchInArray(matrix, target);
        System.out.println("Search result: " + ans);
    }
}


/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: 2D matrix `matrix[][]`              |
         | Example: matrix[][] = {                    |
         |                {1, 2, 3, 4},                |
         |                {5, 6, 7, 8},                |
         |                {9, 10, 11, 12},            |
         |                {13, 14, 15, 16}            |
         | }                                          |
         | TARGET: target = 6                         |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize `rows = 0` and `cols = matrix[0].length - 1`. |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | WHILE rows < matrix.length AND cols >= 0:  |
         |   - IF matrix[rows][cols] == target:       |
         |       - Print found location (rows, cols). |
         |       - Return true.                        |
         |   - ELSE IF target < matrix[rows][cols]:   |
         |       - Go left (decrement cols).          |
         |   - ELSE:                                  |
         |       - Go down (increment rows).          |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | IF target not found, print "Target not found." |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | OUTPUT: Boolean result (true or false).     |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/


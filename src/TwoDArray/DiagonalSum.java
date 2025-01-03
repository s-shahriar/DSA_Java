package TwoDArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {
                          {1,2,3},
                          {4,5,6},
                          {7,8,9}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }

        System.out.println("sum = " + sum);
    }
}


/*
         +--------------------------------------------+
         |                 START                      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | INPUT: 2D matrix `matrix[][]`               |
         | Example: matrix[][] = {                    |
         |                {1,2,3},                    |
         |                {4,5,6},                    |
         |                {7,8,9}                     |
         | }                                          |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize sum = 0.                        |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | FOR each row i from 0 to matrix.length-1: |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |     1. Add matrix[i][i] to sum (primary diagonal). |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |     2. Check if element is not in center   |
         |        (to avoid double-counting for odd-sized matrices). |
         |     IF i != matrix.length-1-i:             |
         |        Add matrix[i][matrix.length-1-i] to sum (secondary diagonal). |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | OUTPUT: Print sum of both diagonals.      |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/


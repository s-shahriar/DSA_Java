package TwoDArray;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                          {1,2,3},
                          {4,5,6},
                          {7,8,9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int transpose[][] = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
                // not transpose[i][j] = matrix[i][j]
                // because we want to transpose the matrix
            }
        }


        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < cols; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
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
         |                {1, 2, 3},                  |
         |                {4, 5, 6},                  |
         |                {7, 8, 9}                   |
         | }                                          |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Initialize `rows = matrix.length` and `cols = matrix[0].length` |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Create an empty matrix `transpose[cols][rows]` |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | Nested loop to fill the transpose matrix:  |
         |   FOR i = 0 TO rows - 1:                   |
         |     FOR j = 0 TO cols - 1:                 |
         |       transpose[j][i] = matrix[i][j]       |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         | PRINT original matrix `matrix[][]` and transpose matrix `transpose[][]` |
         +--------------------------------------------+
                          |
                          v
         +--------------------------------------------+
         |                   END                      |
         +--------------------------------------------+
*/


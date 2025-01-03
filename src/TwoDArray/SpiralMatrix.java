package TwoDArray;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                          {1,2,3},
                          {4,5,6},
                          {7,8,9}
        };

        // Boundaries of the matrix
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            // Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.println(matrix[startRow][j]);
            }

            // Right cols
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.println(matrix[i][endCol]);
            }

            // Bottom row
            for (int j = endCol-1; j >= startCol; j--) {
                if (startRow==endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]);
            }

            // Right row
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol==endCol){
                    break;
                }
                System.out.println(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }


        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }


    }
}

/*
         +----------------------------------------------+
         |                    START                     |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         | INPUT: 2D matrix `matrix[][]`               |
         | Define boundaries:                           |
         | startRow = 0, endRow = matrix.length - 1     |
         | startCol = 0, endCol = matrix[0].length - 1  |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         | WHILE startRow <= endRow AND startCol <= endCol: |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         |     1. Traverse Top Row (left to right).    |
         |        FOR j = startCol TO endCol:           |
         |        - Print matrix[startRow][j]           |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         |     2. Traverse Right Column (top to bottom).|
         |        FOR i = startRow + 1 TO endRow:       |
         |        - Print matrix[i][endCol]             |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         |     3. Traverse Bottom Row (right to left,  |
         |        if not already traversed).           |
         |        IF startRow != endRow:                |
         |        FOR j = endCol - 1 TO startCol:       |
         |        - Print matrix[endRow][j]             |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         |     4. Traverse Left Column (bottom to top, |
         |        if not already traversed).           |
         |        IF startCol != endCol:                |
         |        FOR i = endRow - 1 TO startRow + 1:   |
         |        - Print matrix[i][startCol]           |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         |     5. Update Boundaries to move inward.     |
         |        startRow++, startCol++, endRow--,     |
         |        endCol--.                             |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         | OUTPUT: Print elements in spiral order.      |
         +----------------------------------------------+
                          |
                          v
         +----------------------------------------------+
         |                     END                      |
         +----------------------------------------------+
*/

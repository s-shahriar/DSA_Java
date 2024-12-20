package Pattern;

public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalRows-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
 * +------------------------------------+
 * |               START               |
 * +------------------------------------+
 *                  |
 *                  v
 *      +----------------------------+
 *      | Initialize:                |
 *      | - totalRows = 5            |
 *      +----------------------------+
 *                  |
 *                  v
 * +------------------------------------------+
 * | Outer Loop (i): For each row             |
 * | i = 1 to totalRows                       |
 * +------------------------------------------+
 *                  |
 *                  v
 * +-------------------------------------------------+
 * | Inner Loop (j): For numbers in each row         |
 * | j = 1 to totalRows - i + 1                      |
 * | Print the current value of j                   |
 * +-------------------------------------------------+
 *                  |
 *                  v
 * +--------------------------------+
 * | Move to the next line          |
 * +--------------------------------+
 *                  |
 *                  v
 *        +-------------------+
 *        | End Outer Loop (i)|
 *        +-------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * |            END                    |
 * +------------------------------------+
 */


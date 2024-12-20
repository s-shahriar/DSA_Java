package Pattern;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++){

            // for spaces
            for (int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
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
 *      +------------------------+
 *      | Initialize:            |
 *      | - rows = 5             |
 *      +------------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * | Outer Loop (i): For each row       |
 * | i = 1 to rows                      |
 * +------------------------------------+
 *                  |
 *                  v
 * +---------------------------------------------+
 * | Inner Loop 1 (j): For spaces                |
 * | j = 1 to rows - i                           |
 * | Print " "                                   |
 * +---------------------------------------------+
 *                  |
 *                  v
 * +---------------------------------------------+
 * | Inner Loop 2 (j): For stars                 |
 * | j = 1 to i                                  |
 * | Print "*"                                   |
 * +---------------------------------------------+
 *                  |
 *                  v
 * +-----------------------------+
 * | Move to the next line       |
 * +-----------------------------+
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

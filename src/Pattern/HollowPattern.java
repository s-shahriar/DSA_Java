package Pattern;

public class HollowPattern {
    public static void main(String[] args) {
        int rows = 4;
        int column = 5;

        for(int i = 1; i <= rows; i++){
            for (int j=1; j <= column; j++){
                if (i==1 || i==rows || j==1 || j==column){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*
 *
 * +------------------------------------+
 * |               START               |
 * +------------------------------------+
 *                  |
 *                  v
 *      +------------------------+
 *      | Initialize:            |
 *      | - rows = 4             |
 *      | - column = 5           |
 *      +------------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * | Outer Loop (i): For each row       |
 * | i = 1 to rows                      |
 * +------------------------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * | Inner Loop (j): For each column    |
 * | j = 1 to column                    |
 * +------------------------------------+
 *                  |
 *                  v
 * +-----------------------------------------------+
 * | Condition Check: Is the current position on   |
 * | the boundary?                                 |
 * | (i == 1 || i == rows || j == 1 || j == column)|
 * +-----------------------------------------------+
 *         |                                     |
 *     Yes v                                     v No
 * +---------------------+              +---------------------+
 * | Print "*" (boundary)|              | Print " " (hollow)  |
 * +---------------------+              +---------------------+
 *                  |
 *                  v
 *        +-------------------+
 *        | End Inner Loop (j)|
 *        +-------------------+
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

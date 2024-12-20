package Pattern;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0) System.out.print(1+" ");
                else System.out.print(0+" ");
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
 * +------------------------------------------------------+
 * | Inner Loop (j): For elements in the current row      |
 * | j = 1 to i                                           |
 * | Condition Check:                                     |
 * | IF (i + j) % 2 == 0 THEN Print 1 ELSE Print 0        |
 * +------------------------------------------------------+
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

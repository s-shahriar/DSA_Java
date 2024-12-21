package Pattern;

public class SolidRhombus {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // for spaces
            for (int j = 1; j <= (rows-i) ; j++) {
                System.out.print(" ");
            }

            // for rhombus
            for (int j = 1; j <= rows ; j++) {
                if (j == 1 || j == rows || i == 1 || i == rows) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
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
 * +----------------------------+
 * | Initialize: rows = 5       |
 * +----------------------------+
 *                  |
 *                  v
 * +------------------------------------------+
 * | Outer Loop (i): For rows (1 to rows)     |
 * +------------------------------------------+
 *                  |
 *                  v
 * +------------------------------------------------------+
 * | Inner Loop 1 (j): Print spaces (1 to rows - i)       |
 * +------------------------------------------------------+
 *                  |
 *                  v
 * +------------------------------------------------------+
 * | Inner Loop 2 (j): Print rhombus (*) for all columns  |
 * | If j == 1 OR j == rows OR i == 1 OR i == rows        |
 * | Print "*"                                            |
 * | Else Print " "                                       |
 * +------------------------------------------------------+
 *                  |
 *                  v
 * +----------------------------------+
 * | Move to the next line            |
 * +----------------------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * |               END                 |
 * +------------------------------------+
 */


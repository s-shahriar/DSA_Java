package Pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int totalRows = 5;
        int number = 1;

        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+ " ");
                number++;
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
 *      | - number = 1               |
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
 * | j = 1 to i                                      |
 * | Print 'number' and increment 'number'           |
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

package Pattern;

public class Diamond {
    public static void main(String[] args) {
        int rows = 5;

        // Upper part
        for (int i = 1; i <= rows ; i++) {

            // for spaces
            for (int j = 1; j <= (rows-i); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower Part
        for (int i = rows; i >= 1 ; i--) {

            // for spaces
            for (int j = 1; j <= (rows-i); j++) {
                System.out.print(" ");
            }

            // for stars
            for (int j = 1; j <= (2*i)-1 ; j++) {
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
 * +----------------------------+
 * | Initialize: rows = 5       |
 * +----------------------------+
 *                  |
 *                  v
 * +------------------------------------------------+
 * | Upper Part (Outer Loop i: 1 to rows)           |
 * +------------------------------------------------+
 *       |                      |
 *       v                      v
 * +----------------+    +-----------------------+
 * | Print spaces   |    | Print (2*i - 1) stars |
 * +----------------+    +-----------------------+
 *                  |
 *                  v
 * +------------------------------------------------+
 * | Lower Part (Outer Loop i: rows to 1)           |
 * +------------------------------------------------+
 *       |                      |
 *       v                      v
 * +----------------+    +-----------------------+
 * | Print spaces   |    | Print (2*i - 1) stars |
 * +----------------+    +-----------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * |               END                 |
 * +------------------------------------+
 */

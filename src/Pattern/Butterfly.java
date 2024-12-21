package Pattern;

public class Butterfly {
    public static void main(String[] args) {
        int rows = 4;

        // Upper Part
        for (int i = 1; i <= rows; i++) {

            // Left Stars
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }

            // Spaces in the Middle
            for (int j = 1; j <=2*(rows -i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // Lower Part

        for (int i = rows; i >= 1; i--) {
            // Left Stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spaces in the Middle
            for (int j = 1; j <= 2*(rows -i); j++) {
                System.out.print(" ");
            }

            // Right Stars
            for (int j = 1; j <= i; j++) {
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
 *      | - rows = 4                 |
 *      +----------------------------+
 *                  |
 *                  v
 * +--------------------------------------------+
 * | Upper Part (Outer Loop i: 1 to rows)       |
 * +--------------------------------------------+
 *       |              |             |
 *       v              v             v
 * +----------------+ +------------+ +------------+
 * | Left Stars     | | Middle     | | Right Stars|
 * +----------------+ +------------+ +------------+
 *                  |
 *                  v
 * +--------------------------------------------+
 * | Lower Part (Outer Loop i: rows to 1)       |
 * +--------------------------------------------+
 *       |              |             |
 *       v              v             v
 * +----------------+ +------------+ +------------+
 * | Left Stars     | | Middle     | | Right Stars|
 * +----------------+ +------------+ +------------+
 *                  |
 *                  v
 * +------------------------------------+
 * |               END                 |
 * +------------------------------------+
 */

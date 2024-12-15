public class DecimalToBinary {

    public static int DecToBin(int decimal){
        int pow = 0;
        int binary = 0;
        int rem = 0;

        while (decimal > 0){
            rem = decimal % 2;
            binary += (rem * (int)Math.pow(10,pow));
            pow++;
            decimal /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        int decimal = 29;
        int ans = DecToBin(decimal);
        System.out.println("Binary of " + decimal +" : "+ ans);
    }
}

/*
 * Decimal to Binary Conversion Process:
 *
 * +-----------------------------------------------+
 * |                   START                       |
 * +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------+
 *    | Initialize variables:       |
 *    |  - decimal = given decimal  |
 *    |  - pow = 0                  |
 *    |  - binary = 0               |
 *    |  - rem = 0                  |
 *    +-----------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    | Is decimal > 0? (Check if there are more digits)|
 *    +-----------------------------------------------+
 *         |                                 |
 *    No   v                                 v    Yes
 *    +----------------------------+      +--------------------------+
 *    |   Decimal is 0, stop loop  |      | Get the remainder:       |
 *    |                            |      | rem = decimal % 2        |
 *    |   (End)                    |      +--------------------------+
 *    +----------------------------+                  |
 *                                                    v
 *                                       +-----------------------------+
 *                                       | Update binary:              |
 *                                       | binary += rem * (10^pow)    |
 *                                       +-----------------------------+
 *                                                    |
 *                                                    v
 *                                       +-----------------------------+
 *                                       | Increment power:            |
 *                                       | pow++                       |
 *                                       +-----------------------------+
 *                                                    |
 *                                                    v
 *                                       +-----------------------------+
 *                                       | Divide decimal by 2:        |
 *                                       | decimal = decimal / 2       |
 *                                       +-----------------------------+
 *                                                    |
 *                                                    v
 *                                       +--------------------------------------+
 *                                       | Go back to step: Is decimal > 0?     |
 *                                       +--------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    | Return the binary value (Final result)        |
 *    +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    | Print the binary value: "Binary = X"          |
 *    +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    |                    END                        |
 *    +-----------------------------------------------+
 */


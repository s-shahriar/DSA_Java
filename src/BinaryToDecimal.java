public class BinaryToDecimal {

    public static int BinToDec(int binary){
        int pow = 0;
        int lastDigit = 0;
        int decimal = 0;

        while (binary > 0){
            lastDigit = binary % 10;
            decimal += lastDigit * (int) Math.pow(2,pow);
            pow++;
            binary /= 10;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int binary = 101010;
        int ans = BinToDec(binary);
        System.out.println("Decimal of " +binary+" : "+ ans);
    }
}


/*
 * Binary to Decimal Conversion Process:
 *
 * +-----------------------------------------------+
 * |                   START                       |
 * +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------+
 *    | Initialize variables:       |
 *    |  - binary = given binary    |
 *    |  - pow = 0                  |
 *    |  - lastDigit = 0            |
 *    |  - decimal = 0              |
 *    +-----------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    | Is binary > 0? (Check if there are more digits)|
 *    +-----------------------------------------------+
 *         |                                 |
 *    No   v                                 v    Yes
 *    +----------------------------+      +-------------------------+
 *    |   Binary is 0, stop loop   |      | Get the last digit of   |
 *    |                            |      | binary:                 |
 *    |   (End)                    |      | lastDigit = binary % 10 |
 *    +----------------------------+      +-------------------------+
 *                                                 |
 *                                                 v
 *                                       +--------------------------------+
 *                                       | Update decimal:                |
 *                                       | decimal += lastDigit * (2^pow) |
 *                                       +--------------------------------+
 *                                                 |
 *                                                 v
 *                                       +-----------------------------+
 *                                       | Increment power:            |
 *                                       | pow++                       |
 *                                       +-----------------------------+
 *                                                 |
 *                                                 v
 *                                       +-----------------------------+
 *                                       | Remove the last digit:      |
 *                                       | binary = binary / 10        |
 *                                       +-----------------------------+
 *                                                 |
 *                                                 v
 *                                       +-----------------------------------------------+
 *                                       | Go back to step: Is binary > 0?               |
 *                                       +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    |    Return the decimal value (Final result)   |
 *    +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    | Print the decimal value: "Decimal = X"        |
 *    +-----------------------------------------------+
 *                  |
 *                  v
 *    +-----------------------------------------------+
 *    |                    END                        |
 *    +-----------------------------------------------+
 */
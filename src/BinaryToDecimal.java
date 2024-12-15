public class BinaryToDecimal {

    public static int BinToDec(int binary){
        int pow = 0;
        int lastDigit = 0;
        int decimal = 0;

        while (binary > 0){
            lastDigit = binary%10;
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

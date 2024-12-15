public class DecimalToBinary {

    public static int DecToBin(int decimal){
        int pow = 0;
        int bin = 0;

        while (decimal > 0){
            int rem = decimal % 2;
            bin += (rem * (int)Math.pow(10,pow));
            pow++;
            decimal /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        int decimal = 27;
        int ans = DecToBin(decimal);
        System.out.println("Binary of " + decimal +" : "+ ans);
    }
}

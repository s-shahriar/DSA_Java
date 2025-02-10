package Recursion;

public class PowerOfNumber {
    public static int powerOfNumber(int x, int n) {
        if(n==0) return 1;

        // if Even power (n is even)
        int halfPower = powerOfNumber(x,n/2);
        int halfPowerSquared = halfPower * halfPower;

        // if Odd power (n is odd)
        if(n%2 != 0) {
            halfPowerSquared = x * halfPowerSquared;
        }

        return halfPowerSquared;
    }
    public static void main(String[] args) {
        int ans = powerOfNumber(2, 4);
        System.out.println("Ans = " + ans);
    }
}

package Recursion;

public class PowerOfX {
    public static double myPow(double x, int n) {

        if(n==0) return 1.0;

        // if n is negative
        if(n < 0) {
            x = 1/x;
            if(n == Integer.MIN_VALUE) {
                return x * myPow(x, Integer.MAX_VALUE);
            }
            n = -n; // because if we do -n before the myPow() call it would cause overflow
        }


        // if even number
        double halfPower = myPow(x, n/2);
        double halfPowerSquared = halfPower * halfPower;

        // if odd number
        if(n%2 != 0) return x * halfPowerSquared;

        return halfPowerSquared;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        double ans = myPow(x, n);
        System.out.println("Power of " + x + "^" + n +" is = " + ans);
    }
}


/*
          +-------------------+
          |   Start           |
          +-------------------+
                    |
                    v
        +-------------------------+
        |  If n == 0?             |
        +-------------------------+
                    |
           Yes /         \ No
              /           \
        +-------+     +------------------+
        | Return |     | If n < 0?       |
        |   1.0  |     +------------------+
        +-------+          |
                           v
               +--------------------------+
               | Convert x = 1/x, negate n |
               | Handle MIN_VALUE case     |
               +--------------------------+
                           |
                           v
               +--------------------------+
               | Compute halfPower = myPow(x, n/2) |
               +--------------------------+
                           |
                           v
               +--------------------------+
               | Square the halfPower      |
               | If odd, multiply by x     |
               +--------------------------+
                           |
                           v
                        End

 */
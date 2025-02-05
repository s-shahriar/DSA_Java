package Recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        // Base Cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = fibonacci(n);
        System.out.println("ans = " + ans);
    }
}

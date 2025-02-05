package Recursion;

public class FactorialNumber {

    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int number = 10;
        int ans = factorial(number);
        System.out.println("The factorial of " + number + " is " + ans);
    }
}

package Recursion;

public class SumOfNumbers {
    public static int sumOfNumbers(int n) {
        if(n==0){
            return 0;
        }
        return n + sumOfNumbers(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        int ans = sumOfNumbers(n);
        System.out.println("Ans = " + ans);
    }
}

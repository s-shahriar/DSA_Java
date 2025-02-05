package Recursion;

public class IncreasingNumber {
    public static void printIncreasingNumber(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncreasingNumber(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int end = 12;
        printIncreasingNumber(end);
    }
}

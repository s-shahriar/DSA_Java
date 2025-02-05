package Recursion;

public class DecreasingNumber {

    public static void printDecrease(int n){
        if (n == 1) {
            System.out.print(n+ " ");
            return;
        }
        System.out.print(n + " ");
        printDecrease(n-1);
    }


    public static void main(String[] args) {
        int start = 10;
        printDecrease(start);
    }
}

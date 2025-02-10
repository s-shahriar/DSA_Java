package Recursion;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static boolean checkIfArrayIsSorted(int[] arr, int idx) {
        if(idx==arr.length-1) return true;
        if(arr[idx] > arr[idx+1]) return false;
        return checkIfArrayIsSorted(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,10,7,8,9};
        boolean ans = checkIfArrayIsSorted(arr, 0);
        System.out.println("Provided Array = " + Arrays.toString(arr));
        System.out.println("Sorted ? = " + ans);
    }
}

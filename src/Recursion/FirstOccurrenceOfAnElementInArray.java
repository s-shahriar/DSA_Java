package Recursion;

import java.util.Arrays;

public class FirstOccurrenceOfAnElementInArray {
    public static int firstOccurrence(int[] arr, int idx, int target) {
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        return firstOccurrence(arr, idx+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,5,9};
        int target = 5;
        int ans = firstOccurrence(arr, 0, target);
        System.out.println("Provided Array = " + Arrays.toString(arr));
        System.out.println("First occurrence of " + target + " is in " + ans + "th Index");
    }
}

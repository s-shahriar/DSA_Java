package Recursion;

import java.util.Arrays;

public class LastOccurrenceOfAnElementInArray {
    public static int lastOccurrence(int[] arr, int idx, int target) {
        if(idx < 0) return -1;
        if(arr[idx] == target) return idx;
        return lastOccurrence(arr, idx-1, target);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,7,5,9};
        int target = 5;
        int ans = lastOccurrence(arr, arr.length-1, target);
        System.out.println("Provided Array = " + Arrays.toString(arr));
        System.out.println("Last occurrence of " + target + " is in " + ans + "th Index");
    }
}

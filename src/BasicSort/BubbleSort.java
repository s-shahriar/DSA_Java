package BasicSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 6, 5, 4, 7, 3, 9, 10};

        // Outer loop for multiple passes over the array
        for (int i = 0; i < arr.length - 2; i++) {
            // Inner loop to compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap if elements are out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}

/*
    Flow Diagram for Bubble Sort:

    +---------------------------------------+
    |               START                   |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |   INPUT: Unsorted Array `arr[]`       |
    |   e.g., {10, 2, 8, 6, 5, 4, 7, 3, 9}  |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |   Outer Loop: Repeat (n-2) Passes     |
    |   For i = 0 to arr.length-1-i         |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |   Inner Loop: Compare Adjacent Pairs  |
    |   For j = 0 to arr.length-2-i         |
    |       IF (arr[j] > arr[j+1])          |
    |          SWAP arr[j] and arr[j+1]     |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |   Move Largest Element in Unsorted    |
    |   Portion to Correct Position         |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |   If No Swaps in Pass, Array Sorted   |
    |   Exit Early (Optimization Step)      |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |   OUTPUT: Sorted Array in Ascending   |
    |   e.g., {2, 3, 4, 5, 6, 7, 8, 9, 10}  |
    +---------------------------------------+
                     |
                     v
    +---------------------------------------+
    |                 END                   |
    +---------------------------------------+
*/


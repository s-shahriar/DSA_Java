package BasicSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 6, 5, 4, 7, 3, 9, 10};

        // Outer loop to iterate over the array
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i; // Assume the first unsorted element is the smallest

            // Inner loop to find the minimum element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j; // Update minPos if a smaller element is found
                }
            }

            // Swap the smallest element found with the first unsorted element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}

/*
    Flow Diagram for Selection Sort:

    +--------------------------------------------+
    |                    START                   |
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    | INPUT: Unsorted Array `arr[]`              |
    | e.g., {10, 2, 8, 6, 5, 4, 7, 3, 9, 10}     |
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    | Outer Loop: For i = 0 to arr.length-1      |
    |   - Assume arr[i] is the smallest element  |
    |     in the unsorted portion.               |
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    | Inner Loop: For j = i+1 to arr.length-1    |
    |   - Compare arr[minPos] with arr[j].       |
    |   - IF (arr[j] < arr[minPos]),             |
    |       Update minPos to j.                 |
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    | Swap arr[minPos] with arr[i]               |
    | (Place the smallest element in its correct |
    |  position).                                |
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    | Repeat Outer Loop for Next Unsorted Portion|
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    | OUTPUT: Sorted Array `arr[]`               |
    | e.g., {2, 3, 4, 5, 6, 7, 8, 9, 10, 10}     |
    +--------------------------------------------+
                         |
                         v
    +--------------------------------------------+
    |                     END                    |
    +--------------------------------------------+
*/

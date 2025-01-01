package BasicSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 8, 6, 5, 4, 7, 3, 9, 10};

        // Start from the second element (index 1) as the first element is already "sorted"
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i]; // The value to be inserted
            int prev = i - 1;          // Index of the previous element in the sorted portion

            // Shift elements of the sorted portion to the right to make space for currentValue
            while (prev >= 0 && arr[prev] > currentValue) {
                arr[prev + 1] = arr[prev]; // Move the larger element one position to the right
                prev--;
            }

            // Insert the currentValue in the correct position
            arr[prev + 1] = currentValue;
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}


/*
    Flow Diagram for Insertion Sort:

    +----------------------------------------------+
    |                    START                     |
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    | INPUT: Unsorted Array `arr[]`                |
    | e.g., {10, 2, 8, 6, 5, 4, 7, 3, 9, 10}       |
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    | Outer Loop: For i = 1 to arr.length-1        |
    |   - Take currentValue = arr[i]              |
    |   - Set prev = i-1 (index of last sorted el.)|
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    | Inner Loop: While prev >= 0 AND              |
    |               arr[prev] > currentValue:      |
    |   - Shift arr[prev] to arr[prev+1].          |
    |   - Decrement prev (move backward).          |
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    | Insert currentValue into its correct position|
    |   - Set arr[prev+1] = currentValue.          |
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    | Repeat Outer Loop for next element.          |
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    | OUTPUT: Sorted Array `arr[]`                 |
    | e.g., {2, 3, 4, 5, 6, 7, 8, 9, 10, 10}       |
    +----------------------------------------------+
                         |
                         v
    +----------------------------------------------+
    |                     END                      |
    +----------------------------------------------+
*/

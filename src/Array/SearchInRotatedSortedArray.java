package Array;

import java.util.Arrays;

public class SearchInRotatedSortedArray {

    public static int searchResult(int[] array, int target) {
        int length = array.length;  // Length of the input array
        int start = 0;              // Start index of the array
        int end = length - 1;       // End index of the array

        while (start <= end) {      // While the search space is valid
            int mid = (start + end) / 2;  // Calculate the middle index

            if (array[mid] == target) {  // If the target is found at mid
                return mid;  // Return the index where the target is found
            }

            // Check whether the left or right portion of the array is sorted
            if (array[start] <= array[mid]) {  // Left portion is sorted
                if (array[start] <= target && target <= array[mid]) {  // Target is in the left portion
                    end = mid - 1;  // Narrow the search space to the left portion
                } else {
                    start = mid + 1;  // Target must be in the right portion, adjust the search space
                }
            } else {  // Right portion is sorted
                if (array[mid] <= target && target <= array[end]) {  // Target is in the right portion
                    start = mid + 1;  // Narrow the search space to the right portion
                } else {
                    end = mid - 1;  // Target must be in the left portion, adjust the search space
                }
            }
        }

        return -1;  // If the target is not found, return -1
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int ans = searchResult(array, target);  // Perform the search
        System.out.println("Array = " + Arrays.toString(array));  // Print the array
        System.out.println("Value to search = " + target);  // Print the target value
        System.out.println("Search Found at = " + ans);  // Print the result (index where the target was found)
    }
}

/*
 +----------------------------------------+
 |               START                    |
 +----------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  INPUT: array[] = {4, 5, 6, 7, 0, 1, 2}     |
 |         target = 0                           |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  1. Initialize variables:                     |
 |     - Let `start = 0` (start index of the array) |
 |     - Let `end = length - 1` (end index of the array) |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  2. Enter the while loop (start <= end):      |
 |     - Calculate `mid = (start + end) / 2`.     |
 |     - If `array[mid] == target`, return `mid` (target found). |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  3. Check if left or right portion is sorted: |
 |     - If left portion is sorted (`array[start] <= array[mid]`), check if target is in the left portion. |
 |     - If right portion is sorted, check if target is in the right portion. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  4. Narrow the search space accordingly:      |
 |     - If the target is in the left portion, adjust `end = mid - 1`. |
 |     - If the target is in the right portion, adjust `start = mid + 1`. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  5. If the target is not found, return `-1`.  |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  OUTPUT: Search Found at = 4 (index of target). |
 +-----------------------------------------------+
                          |
                          v
 +----------------+
 |     END        |
 +----------------+
*/


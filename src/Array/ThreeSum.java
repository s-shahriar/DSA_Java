package Array;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] array) {
        int length = array.length;  // Length of the input array
        if (array == null || length < 3) {  // If the array is invalid or too small to form a triplet
            return new ArrayList<>();
        }

        Arrays.sort(array);  // Sort the array to enable two-pointer technique
        Set<List<Integer>> result = new HashSet<>();  // To store unique triplets (avoids duplicates)

        for (int i = 0; i < length - 2; i++) {  // Loop to fix the first element of the triplet
            // Use two pointers (left and right) to find the other two elements
            int left = i + 1;
            int right = length - 1;

            while (left < right) {  // While the left pointer is to the left of the right pointer
                int sum = array[i] + array[left] + array[right];  // Calculate the sum of the triplet

                if (sum == 0) {  // If sum equals 0, we found a valid triplet
                    result.add(Arrays.asList(array[i], array[left], array[right]));  // Add the triplet to the result set
                    left++;  // Move left pointer right to check for other possibilities
                    right--;  // Move right pointer left to check for other possibilities
                } else {
                    if (sum < 0) {  // If sum is less than 0, move the left pointer to the right
                        left++;
                    } else {  // If sum is greater than 0, move the right pointer to the left
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);  // Convert the HashSet to a List and return
    }

    public static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};  // Example input array

        ThreeSum solution = new ThreeSum();  // Create an instance of the solution

        // Call the threeSum method to get the triplets
        List<List<Integer>> result = solution.threeSum(array);

        System.out.println("Array = " + Arrays.toString(array));  // Print the input array
        System.out.println("Three Sum Results = " + result);  // Print the results
    }
}

/*
 +----------------------------------------+
 |               START                    |
 +----------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  INPUT: array[] = {-1, 0, 1, 2, -1, -4}     |
 |         The goal is to find unique triplets   |
 |         whose sum equals zero.               |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  1. Sort the array:                          |
 |     - Sort array[] to enable two-pointer approach. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  2. Initialize an empty HashSet to store unique triplets. |
 |     - HashSet removes duplicate triplets automatically. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  3. Loop through the array to fix the first element (`array[i]`). |
 |     - For each `array[i]`, use two pointers: left and right. |
 |     - Calculate sum of `array[i] + array[left] + array[right]`. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  4. Check if sum equals 0:                   |
 |     - If sum == 0, add the triplet to the result. |
 |     - Move left and right pointers inward to find other possible triplets. |
 |     - If sum < 0, move the left pointer right. |
 |     - If sum > 0, move the right pointer left. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  5. Return the result as a List of triplets.  |
 |     - Convert HashSet to List to return the result. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  OUTPUT: Three Sum Results = [ [-1, -1, 2], [ -1, 0, 1 ] ] |
 +-----------------------------------------------+
                          |
                          v
 +----------------+
 |     END        |
 +----------------+
*/



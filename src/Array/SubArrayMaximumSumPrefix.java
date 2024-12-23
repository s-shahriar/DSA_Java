package Array;

public class SubArrayMaximumSumPrefix {
    public static void main(String[] args) {
        //int array[] = {2, 4, 6, 8, 10}; // ans : 30
        //int array[] = {1, -2, 6, -1, 3}; // ans : 8
        int array[] = {-2,1}; // ans : 1
        int length = array.length;
        int[] prefixSum = new int[array.length];

        int maxSum = Integer.MIN_VALUE;

        // Create Prefix Sum Array
        prefixSum[0] = array[0];
        for (int i = 1; i < length; i++) {
            prefixSum[i] = prefixSum[i-1] + array[i];
        }

        // Outer loop determines the starting index of subarrays
        for (int i = 0; i < length; i++) {
            int start = i;
            System.out.println("Outer Index: " + start);

            // Middle loop determines the ending index of subarrays
            for (int j=i; j < length; j++){
                int end = j;
                System.out.println("Inner Index = " + end);
                int currentSum = 0;

                // Calculate the maxSum of the subarray (This is a replacement of Third for loop for determining maxSum
                currentSum = start == 0 ? prefixSum[end] : prefixSum[end] -prefixSum[start-1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            System.out.println("============================");
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}

/*
 * +----------------------------------------------------+
 * |                       START                        |
 * +----------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | Initialize variables:                                         |
 * | - array = {-2, 1} (input array)                               |
 * | - length = array.length (length of the array)                 |
 * | - prefixSum[] = new int[length] (array to store prefix sums)  |
 * | - maxSum = Integer.MIN_VALUE (to store maximum subarray sum)  |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +-------------------------------------------------------------------+
 * | Calculate Prefix Sum Array:                                       |
 * | - prefixSum[0] = array[0]                                         |
 * | - For i = 1 to length-1: prefixSum[i] = prefixSum[i-1] + array[i] |
 * +-------------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | OUTER LOOP: i = 0 to length-1                                 |
 * | - `i` represents the starting index of the subarray (`start`).|
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | INNER LOOP: j = i to length-1                                 |
 * | - `j` represents the ending index of the subarray (`end`).    |
 * | - Calculate `currentSum` using prefix sum:                   |
 * |   - If `start == 0`: currentSum = prefixSum[end]              |
 * |   - Else: currentSum = prefixSum[end] - prefixSum[start-1]    |
 * | - If currentSum > maxSum, update maxSum = currentSum.         |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------+
 * | Print the final maximum subarray sum (`maxSum`).  |
 * +---------------------------------------------------+
 *                          |
 *                          v
 * +------------------------------------------------+
 * |                     END                        |
 * +------------------------------------------------+
 */

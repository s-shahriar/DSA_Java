package Array;

public class SubArrayMaximumSum {
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10}; // ans : 30
        // int array[] = {1, -2, 6, -1, 3}; // ans : 8
        //int array[] = {-2}; // ans : 8
        int length = array.length;

        int maxSum = Integer.MIN_VALUE;


        // Outer loop determines the starting index of subarrays
        for (int i = 0; i < length; i++) {
            int start = i;
            System.out.println("Outer Index: " + start);

            // Middle loop determines the ending index of subarrays
            for (int j=i; j < length; j++){
                int end = j;
                System.out.println("Inner Index = " + end);
                int currentSum = 0;
                // Inner loop to calculate the maxSum of the current subarray
                for (int k=start; k<=end; k++){
                    System.out.println("start = " +  start +" end = " + end);
                    currentSum += array[k];
                    System.out.println("Current Sum = " + currentSum);
                    System.out.println("-----");
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
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
 * | - array = {2, 4, 6, 8, 10} (input array)                     |
 * | - length = array.length (length of the array)                 |
 * | - maxSum = Integer.MIN_VALUE (to store maximum subarray sum)  |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | OUTER LOOP: i = 0 to length-1                                 |
 * | - `i` represents the starting index of the subarray (`start`).|
 * | - Iterate through all possible starting indices.              |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | MIDDLE LOOP: j = i to length-1                                |
 * | - `j` represents the ending index of the subarray (`end`).    |
 * | - Iterate through all possible subarray lengths.              |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | INNER LOOP: k = start to end                                  |
 * | - Calculate the sum of the subarray from `start` to `end`.    |
 * | - Update `currentSum` during each iteration.                  |
 * | - If `currentSum > maxSum`, update `maxSum`.                  |
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

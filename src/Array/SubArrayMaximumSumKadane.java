package Array;

public class SubArrayMaximumSumKadane {

    public static void main(String[] args) {
        //int array[] = {2, 4, 6, 8, 10}; // ans : 30
        //int array[] = {1, -2, 6, -1, 3}; // ans : 8
        //int array[] = {-2}; // ans : -2
        int array[] = {-2, -4, -6, -8, -10}; // ans : -2
        int length = array.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // Kadane's Algorithm
        for (int i=0; i < length; i++ ){
            currentSum += array[i];

            // maxSum is handled before if there are all negative values in the array
            maxSum = Math.max(currentSum, maxSum);

            if(currentSum < 0){
                currentSum = 0;
            }
        }

        System.out.println("Max Sum is : " + maxSum);
    }
}

 /*
         +-------------------------------------+
         |               START                 |
         +-------------------------------------+
                          |
                          v
         +---------------------------------------------+
         | Initialize:                                  |
         | - maxSum = Integer.MIN_VALUE                |
         | - currentSum = 0                            |
         +---------------------------------------------+
                          |
                          v
         +---------------------------------------------+
         | LOOP: Iterate through each element in array |
         | For i = 0 to length - 1:                    |
         | - Add array[i] to currentSum                |
         | - Update maxSum = max(currentSum, maxSum)   |
         | - If currentSum < 0, reset currentSum = 0   |
         +---------------------------------------------+
                          |
                          v
         +-----------------------------------+
         | Print maxSum (Maximum Subarray Sum) |
         +-----------------------------------+
                          |
                          v
         +-------------+
         |    END      |
         +-------------+
 */

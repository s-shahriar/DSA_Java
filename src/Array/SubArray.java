package Array;

public class SubArray {

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,14};
        int length = array.length;
        int totalPairs = 0;

        for (int i = 0; i < length ; i++) {
            int start = i;

            for (int j = i; j < length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print(array[k]+" ");
                }
                totalPairs++;
                System.out.println();
            }
            System.out.println();

            System.out.println("=======");
        }
        System.out.println("Total Pairs Found = " + totalPairs);
    }
}

/*
 * +----------------------------------------------------+
 * |                       START                        |
 * +----------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | Initialize:                                                   |
 * | array = {2, 4, 6, 8, 10, 14},                                 |
 * | length = array.length (size of array),                        |
 * | totalPairs = 0 (to count the total subarrays)                 |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +------------------------------------------------------------+
 * | Outer Loop (i = 0 to length-1):                            |
 * | - Defines the starting index of the subarray (start = i).  |
 * +------------------------------------------------------------+
 *                          |
 *                          v
 * +------------------------------------------------------------+
 * | Inner Loop (j = i to length-1):                            |
 * | - Defines the ending index of the subarray (end = j).      |
 * | - For every (i, j) pair, a subarray is generated.          |
 * +------------------------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------------------+
 * | Innermost Loop (k = start to end-1):                          |
 * | - Iterates through the subarray from start to end.            |
 * | - Prints elements in the range array[start] to array[end-1].  |
 * +---------------------------------------------------------------+
 *                          |
 *                          v
 * +-----------------------------------------------+
 * | Increment totalPairs counter for each subarray.|
 * +-----------------------------------------------+
 *                          |
 *                          v
 * +---------------------------------------------------+
 * | Print the total number of subarrays (totalPairs). |
 * +---------------------------------------------------+
 *                          |
 *                          v
 * +------------------------------------------------+
 * |                     END                        |
 * +------------------------------------------------+
 */

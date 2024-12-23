package Array;

import java.util.Arrays;

public class ReverseArray {

    public static int[] RevArray(int[] array){
        int start = 0;
        int end = array.length-1;
        int temp;

        while (start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,14};
        System.out.println("Array = " + Arrays.toString(array));
        int ans[] = RevArray(array);
        System.out.println("Reversed Array = " + Arrays.toString(ans));
    }
}

/*
 * +--------------------------------------+
 * |                START                 |
 * +--------------------------------------+
 *                   |
 *                   v
 * +--------------------------------------------+
 * | Initialize:                                |
 * | array[] = {2, 4, 6, 8, 10, 14}             |
 * | start = 0, end = array.length - 1          |
 * +--------------------------------------------+
 *                   |
 *                   v
 * +--------------------------------------------------+
 * | WHILE (start < end):                             |
 * +--------------------------------------------------+
 *       |                          |
 *       v                          v
 * +------------------+         +--------------------------+
 * | Swap elements:   |         | Update indices:            |
 * | temp = array[start]        | start = start + 1          |
 * | array[start] = array[end]  | end = end - 1              |
 * | array[end] = temp          |                            |
 * +------------------+          +--------------------------+
 *                   |
 *                   v
 * +--------------------------------------------+
 * | RETURN the reversed array                  |
 * +--------------------------------------------+
 *                   |
 *                   v
 * +--------------------------------------+
 * |                 END                  |
 * +--------------------------------------+
 */


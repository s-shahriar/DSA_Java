package Array;

import java.util.Arrays;

public class BinarySearch {

    public static int BinSearch(int[] array, int search){
        int start = 0;
        int end = array.length-1;

        while (start <= end){
            int mid = (int) (start+end)/2;

            if (array[mid] == search){
                return mid;
            }

            if(array[mid]>search){
                end = mid - 1;
            }

            if (array[mid]<search){
                start = mid +1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,14};
        int search = 8;
        int index = BinSearch(array,search);
        String ans;

        if(index<0){
            ans = "Not Found";
        } else {
            ans = String.valueOf(index);
        }

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Search = " + search);
        System.out.println("Result: "+ ans);
    }
}

/*
 * +------------------------------------+
 * |               START               |
 * +------------------------------------+
 *                  |
 *                  v
 * +----------------------------+
 * | Initialize:                |
 * | array[] = {2, 4, 6, 8, 10, 14} |
 * | search = 8                 |
 * | start = 0, end = array.length - 1 |
 * +----------------------------+
 *                  |
 *                  v
 * +----------------------------------------------+
 * | WHILE (start <= end):                        |
 * +----------------------------------------------+
 *       |                      |
 *       v                      v
 * +----------------------------+    +-----------------------------------+
 * | Compute mid = (start + end)/2 |    | Compare array[mid] with search |
 * +----------------------------+    +-----------------------------------+
 *       |                      |                    |
 *       v                      v                    v
 * +------------------+   +------------------+   +----------------+
 * | Found? Return mid|   | Update end       |   | Update start   |
 * +------------------+   | end = mid - 1    |   | start = mid + 1|
 *                        +------------------+   +----------------+
 *                  |
 *                  v
 * +-----------------------------+
 * | Return -1 (if not found)    |
 * +-----------------------------+
 *                  |
 *                  v
 * +------------------------------------+
 * |               END                 |
 * +------------------------------------+
 */

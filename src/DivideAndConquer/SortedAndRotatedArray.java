package DivideAndConquer;

import java.util.Arrays;

public class SortedAndRotatedArray {

    public static int search(int[] nums, int target) {
        return searchHelper(nums, target, 0, nums.length-1);
    }

    public static int searchHelper(int[] nums, int target, int si, int ei){
        //Base case
        if(si > ei) {
            return -1;
        }

        int mid = si + (ei - si ) / 2;

        if(nums[mid] == target) {
            return mid;
        }

        // Suppose the mid falls in Line 1
        if(nums[si] <= nums[mid]){
            // Case a: falls in Line 1's left side
            if(target >= nums[si] && target <= nums[mid]){
                return searchHelper(nums, target, si, mid-1);
            } else {
                // Case b: falls in Line 1's right + Line 2 area
                return searchHelper(nums, target, mid+1, ei);
            }
        } else {
            // mid falls in Line 2
            // Case c: falls in Line 2's right side
            if(target >= nums[mid] && target <= nums[ei]){
                return searchHelper(nums, target, mid+1, ei);
            } else {
                return searchHelper(nums, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println("Provided Array = " + Arrays.toString(nums));
        System.out.println("ans = " + ans);
    }
}

/*
         +--------------------------------+
         |            START               |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Input: Array nums, target     |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         | Call searchHelper(nums, target,|
         | si=0, ei=nums.length-1)        |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         | Check if si > ei               |
         +--------------------------------+
                        |
             +----------+----------+
             |                     |
          Yes (si > ei)          No (si ≤ ei)
             |                     |
             v                     v
 +-------------------+    +-------------------+
 | Return -1         |    | Calculate mid =   |
 | (Target not found)|    | si + (ei - si)/2  |
 +-------------------+    +-------------------+
                        |
                        v
         +--------------------------------+
         | Check if nums[mid] == target   |
         +--------------------------------+
                        |
             +----------+----------+
             |                     |
          Yes (nums[mid] == target) No
             |                     |
             v                     v
 +-------------------+    +-------------------+
 | Return mid        |    | Check if nums[si] |
 | (Target found)    |    | <= nums[mid]      |
 +-------------------+    +-------------------+
                        |
                        v
         +--------------------------------+
         | If nums[si] <= nums[mid]:      |
         |   Check if target is in left   |
         |   half (nums[si] to nums[mid]) |
         | Else:                          |
         |   Check if target is in right  |
         |   half (nums[mid] to nums[ei]) |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         | Recursively call searchHelper  |
         | on the appropriate half        |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |            END                 |
         +--------------------------------+

*/


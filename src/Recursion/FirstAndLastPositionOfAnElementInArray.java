package Recursion;

import java.util.Arrays;

public class FirstAndLastPositionOfAnElementInArray {
    public static int findFirstIndex(int[] nums, int target) {
        int index = -1; // let target is not found

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                index = mid;
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return index;
    }

    public static int findLastIndex(int[] nums, int target) {
        int index = -1; // let target is not found

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] arrayAns = new int[2];

        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);

        arrayAns[0] = firstIndex;
        arrayAns[1] = lastIndex;

        System.out.println("Target " + target + " is found at : " + Arrays.toString(arrayAns));

    }
}

/*
              +--------------------+
              |       Start        |
              +--------------------+
                        |
                        v
          +-------------------------+
          |  Initialize start = 0    |
          |  end = length(nums) - 1  |
          |  index = -1              |
          +-------------------------+
                        |
                        v
               +----------------+
         +--> |  start ≤ end ?  | --+
         |     +----------------+   |
         |            |             |
         |           Yes            No
         |            |             |
         |            v             v
         |    +----------------+   "Return -1"
         |    |  mid = (start + end) / 2 |
         |    +----------------+
         |            |
         v            v
   +----------------------+
   | nums[mid] == target? |
   +----------------------+
         |      |
        Yes    No
         |      |
         v      v
+--------------------------+   +----------------------+
| Update index = mid       |   | nums[mid] < target? |
|                          |   +----------------------+
| First Occurrence: end = mid - 1  |    |
| Last Occurrence: start = mid + 1 |    |
+--------------------------+    |   |
        |                       |   |
        |------------------------+   |
        v                            v
   +------------------+      +------------------+
   | start = mid + 1  |      | end = mid - 1    |
   +------------------+      +------------------+
        |                     |
        +---------------------+
                        |
                        v
              +----------------------+
              |   Return final index  |
              +----------------------+
                        |
                        v
                   +------------+
                   |    End     |
                   +------------+

 */
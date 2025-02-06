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


//searchHelper(nums, target, si, ei)
//1. If si > ei:
//        return -1
//        2. Find mid = (si + ei) / 2
//3. If nums[mid] == target:
//        return mid
//4. If left half is sorted (nums[si] <= nums[mid]):
//a. If target ∈ [nums[si], nums[mid]]:
//Search in left half → searchHelper(nums, target, si, mid-1)
//b. Else:
//Search in right half → searchHelper(nums, target, mid+1, ei)
//5. Else (Right half is sorted):
//a. If target ∈ [nums[mid], nums[ei]]:
//Search in right half → searchHelper(nums, target, mid+1, ei)
//b. Else:
//Search in left half → searchHelper(nums, target, si, mid-1)

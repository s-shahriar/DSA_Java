package DivideAndConquer;

import java.util.Arrays;

public class SortedAndRotatedArray {
    public static int search(int[] nums, int target, int si, int ei) {
        int mid = si + (ei - si) / 2;

        if(nums[mid] == target) {
            return mid;
        }

        // Suppose its falls on L1 line
        if(nums[si] <= mid){
            // Case a: L1's left side
            if(nums[si] <= target && target < nums[mid]) {
                return search(nums, target, si, mid);
            } else {
                // Case b: falls on L1's right to L2
                return search(nums, target, mid + 1, ei);
            }
        } else {
            // Falls on L2 line
            if(nums[mid] <= target && target <= nums[ei]) {
                // Case c: Falls on L2's right side
                return search(nums, target, si, mid + 1);
            } else {
                // Case d: falls on L2's right to L1
                return search(nums, target, mid + 1, ei);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(nums, target, 0 , nums.length-1);
        System.out.println("Provided Array = " + Arrays.toString(nums));
        System.out.println("ans = " + ans);
    }
}

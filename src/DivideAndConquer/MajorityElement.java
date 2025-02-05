package DivideAndConquer;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {

            if(votes == 0){
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]){
                votes++;
            } else {
                votes--;
            }
        }

        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int ans = majorityElement(nums);
        System.out.println("Input array: " + Arrays.toString(nums));
        System.out.println("The majority element is " + ans);
    }
}

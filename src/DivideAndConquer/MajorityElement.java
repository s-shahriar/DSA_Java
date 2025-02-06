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

/*
         +--------------------------------+
         |            START               |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Input: An array 'nums'        |
         |  Example: nums = [3,2,3]       |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Initialize                    |
         |  majority = nums[0]            |
         |  votes = 1                     |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Loop through each element     |
         |  in nums from index 1          |
         +--------------------------------+
                        |
                        v
         |  If votes == 0:                |
         |    - Set majority = nums[i]    |
         |    - Increase votes            |
         +--------------------------------+
                        |
                        v
         |  Else If nums[i] == majority:  |
         |    - Increase votes            |
         +--------------------------------+
                        |
                        v
         |  Else:                          |
         |    - Decrease votes             |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |  Output: Majority element      |
         +--------------------------------+
                        |
                        v
         +--------------------------------+
         |            END                 |
         +--------------------------------+
*/

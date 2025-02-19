package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public static List<List<Integer>> subsetsII(int[] nums) {
        Arrays.sort(nums); // Sort the array
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findSubsets(result, nums, temp,0);
        return result;
    }

    public static void findSubsets(List<List<Integer>> result, int[] nums, List<Integer> temp, int start) {

        // If the set is already present, just skip
        if (result.contains((temp)))
            return;

        result.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            // if Yes
            temp.add(nums[i]);
            // backtrack
            findSubsets(result, nums, temp, i+1);
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> result = subsetsII(nums);
        System.out.println("result = " + result);
    }
}

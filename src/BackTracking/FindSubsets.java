package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class FindSubsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        findSubsets(result, nums, temp,0);
        return result;
    }


    public static void findSubsets(List<List<Integer>> result, int[] nums, List<Integer> temp, int start) {
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
        int[] nums = {1,2,3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}

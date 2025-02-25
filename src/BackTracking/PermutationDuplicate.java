package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationDuplicate {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(result, nums, temp, used);
        return result;
    };

    public static void backtrack(List<List<Integer>> result, int[] nums, List<Integer> temp, boolean[] used){
        // base case
        // just one more check, if the temp is already in the result then don't add
        if(temp.size() == nums.length && !result.contains(temp)){
            result.add(new ArrayList<>(temp));
        }

        for(int i = 0; i < nums.length; i++){

            // check if the letter is used already
            if(used[i]){
                continue;
            }

            // if not, now use and assign it true
            used[i] = true;
            temp.add(nums[i]);

            // backtrack
            backtrack(result, nums, temp, used);

            // reset the flag
            used[i] = false;
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}

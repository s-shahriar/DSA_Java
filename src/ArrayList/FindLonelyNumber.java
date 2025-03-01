package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindLonelyNumber {
    public static List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();

        // count frequency
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i],0) +1 );
        }

        for (int i = 0; i < nums.length; i++) {
            if(mp.get(nums[i]) == 1 && !mp.containsKey(nums[i]+1) && !mp.containsKey(nums[i]-1)){
                res.add(nums[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {10,6,5,8};
        List<Integer> res = findLonely(nums);
        System.out.println(res);
    }
}

package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberFollowingKey {
    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // count frequency after key
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0) + 1);
            }
        }

        int maxCount = 0;
        int maxValue = 0;

        for (Map.Entry<Integer, Integer> ele : map.entrySet()){
            if(ele.getValue() > maxCount){
                maxCount = ele.getValue();
                maxValue = ele.getKey();
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,3};
        int key = 2;

        int ans = mostFrequent(nums, key);
        System.out.println(ans);
    }
}

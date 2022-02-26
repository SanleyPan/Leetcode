package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map =new HashMap();
        for( int i = 0; i < nums.length; i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }


    //For this question, there is one point we need notify , we need to use map to decrease time complexity,
    // put indices as value ,data as key ,so we can  find
    // the result we need ,and one loop is enough

}
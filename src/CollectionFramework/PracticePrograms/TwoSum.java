package CollectionFramework.PracticePrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int need=target-nums[i];
            if(map.containsKey(need))
            {
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};

    }

    public static void main(String[] args) {
//        int []arr=twoSum(new int[]{2,3,4,5,9},9);
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4, 5}, 9)));
//        System.out.println(Arrays.toString(arr));
    }
}
// if(map.get(nums[i])+map.getOrDefault(nums[i+1],0)==target)
//        {
//        return new int[]{map.get(nums[i]),map.get(nums[i+1])};
//        }
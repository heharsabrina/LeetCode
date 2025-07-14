package two_pointers;

import java.util.HashMap;
import java.util.Map;

// HashMap
// Time Complexity: O(N)
// Space Complexity: O(N)

public class MaxNumberOfKSumPairs_1679_2
{
    public int maxOperations(int[] nums, int k)
    {
        Map<Integer, Integer> map=new HashMap<>();
        int c=0;

        for(int i=0;i<nums.length;i++)
        {
            int res=k-nums[i];
            if(map.containsKey(res))
            {
                c++;
                if(map.get(res)==1)
                    map.remove(res);
                else
                    map.put(res, map.get(res) - 1);
            }
            else
            {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return c;
    }
}

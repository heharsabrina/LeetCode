package two_pointers;

import java.util.Arrays;

// Two Pointers
// Time Complexity: O(N log N) - Due to sorting
// Space Complexity: O(1)

public class MaxNumberOfKSumPairs_1679
{
    public int maxOperations(int[] nums, int k)
    {
        Arrays.sort(nums);
        int len=nums.length;
        int i=0, j=len-1, c=0;
        while(j>i)
        {
            int sum=nums[i]+nums[j];
            if(sum==k)
            {
                i++;
                j--;
                c++;
            }
            else if(sum<k)
                i++;
            else
                j--;
        }
        return c;
    }
}

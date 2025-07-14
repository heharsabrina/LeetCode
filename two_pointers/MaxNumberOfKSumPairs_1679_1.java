package two_pointers;

// Brute Force
// Time Complexity: O(N^2)
// Space Complexity: O(1)

public class MaxNumberOfKSumPairs_1679_1
{
    public int maxOperations(int[] nums, int k)
    {
        int len=nums.length, c=0;

        for(int i=0;i<len;i++)
        {
            if(nums[i]==-1) continue;
            for(int j=i+1;j<len;j++)
            {
                if(nums[j]==-1) continue;
                if(nums[i]+nums[j]==k)
                {
                    nums[i]=-1;
                    nums[j]=-1;
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}

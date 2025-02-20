// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution
{
    public int minSubArrayLen(int target, int[] nums)
    {
        int l=0, r, sum=0, minLen=Integer.MAX_VALUE;
        for(r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                minLen=Math.min(minLen, r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return (minLen==Integer.MAX_VALUE)? 0:minLen;
    }
}
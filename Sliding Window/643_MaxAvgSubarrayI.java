// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution
{
    public double findMaxAverage(int[] nums, int k)
    {
        int i=0, sum=0;
        float avg=0;
        for(i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        int max=sum;
        for(i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            if(max<sum)
                max=sum;
        }
        return (double) max/k;
    }
}
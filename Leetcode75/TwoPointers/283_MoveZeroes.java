package Leetcode75.TwoPointers;

// Time Complexity: O(N)
// Space Complexity: O(1)
public class 283_MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        int i=0, j=0, n=nums.length, temp=0;
        while(j<n)
        {
            if(nums[j]==0)
                j++;
            else
            {
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
        }
    }
}
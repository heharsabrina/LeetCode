package two_pointers;

// Time Complexity: O(N)
// Space Complexity: O(1)

class TwoSumII_167
{
    public int[] twoSum(int[] numbers, int target)
    {
        int i=0, j=numbers.length-1;
        while(j>i)
        {
            int sum=numbers[i]+numbers[j];
            if(sum==target)
                return new int[]{i + 1, j + 1};
            else if(sum<target)
                i++;
            else
                j--;
        }
         return new int[]{-1, -1};
    }
}
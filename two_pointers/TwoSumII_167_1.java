package two_pointers;

// Brute Force - For when the array is NOT sorted
// Time Complexity: O(N^2) - Two loops
// Space Complexity: O(1)

public class TwoSumII_167_1
{
    public int[] twoSum(int[] numbers, int target)
    {
        int len=numbers.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(numbers[i]+numbers[j]==target)
                    return new int[]{ i + 1, j + 1 };
            }
        }
        return new int[0];
    }
}
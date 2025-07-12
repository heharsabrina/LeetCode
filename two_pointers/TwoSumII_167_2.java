package two_pointers;

// Binary Search - For when the array IS sorted
// Time Complexity: O(N log N) - Outer loop (N) + Binary Search for each element (log N)
// Space Complexity: O(1)

public class TwoSumII_167_2
{
    public int[] twoSum(int[] numbers, int target)
    {
        int len=numbers.length;
        for(int i=0;i<len;i++)
        {
            int low=i+1, high=len-1;
            while(low<=high)
            {
                int mid=low+(high-low)/2;

                if(numbers[mid]==target-numbers[i])
                    return new int[]{ i + 1, mid + 1 };

                else if(numbers[mid]<target-numbers[i])
                    low=mid+1;

                else
                    high=mid-1;
            }
        }
        return new int[]{ -1, -1};
    }
}
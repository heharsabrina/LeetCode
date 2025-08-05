package LeetCode75.Array_String;

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution
{
    public boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int count=0;
        for(int i=0; i<flowerbed.length; i++)
        {
            if(flowerbed[i]==0)
            {
                boolean leftPlot=(i==0) || (flowerbed[i-1]==0);
                boolean rightPlot=(i==flowerbed.length-1) || (flowerbed[i+1]==0);
                if(leftPlot && rightPlot)
                {
                    flowerbed[i]=1;
                    count++;
                    if(count>=n)
                        return true;
                }
            }
            
        }
        return count>=n;
    }
}
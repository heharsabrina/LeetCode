package two_pointers;

// Two Pointers
// Time Complexity: O(N)
// Space Complexity: O(1)

public class ContainerWithMostWater_11
{
    public int maxArea(int[] height)
    {
        int n=height.length;
        int i=0, j=n-1, area=0;

        while(j>i)
        {
            area=Math.max(Math.min(height[i], height[j])*(j-i), area);
            // int h=Math.min(height[i], height[j]);
            // while(j>i && height[i]<=h) i++;
            // while(j>i && height[j]<=h) j--;
            // or
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return area;
    }
}

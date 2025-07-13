package two_pointers;

// Brute Force
// Time Complexity: O(N^2)
// Space Complexity: O(1)

public class ContainerWithMostWater_11_1
{
    public int maxArea(int[] height)
    {
        int n=height.length;
        int area=0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int h=Math.min(height[i], height[j]);
                int w=(j-i);
                area=Math.max(h*w, area);
            }
        }
        return area;
    }
}

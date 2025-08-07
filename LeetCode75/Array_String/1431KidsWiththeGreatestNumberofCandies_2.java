package LeetCode75.Array_String;

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution
{
    public boolean[] kidsWithCandies(int[] candies, int extraCandies)
    {
        int maxCandies=0;
        for(int candy:candies)
        {
            if(maxCandies<candy) maxCandies=candy;
        }
        boolean[] result=new boolean[candies.length];
        for(int i=0;i<candies.length;i++)
        {
            result[i]=(candies[i]+extraCandies) >=maxCandies;
        }
        return result;
    }
}
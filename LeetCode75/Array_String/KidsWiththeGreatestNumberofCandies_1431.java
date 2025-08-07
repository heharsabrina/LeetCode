package LeetCode75.Array_String;

import java.util.ArrayList;
import java.util.List;

// Time Complexity: O(n)
// Space Complexity: O(n)

public class KidsWiththeGreatestNumberofCandies_1431
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int maxCandies=0;
        for(int candy:candies)
        {
            maxCandies=Math.max(candy, maxCandies);
        }

        List<Boolean> result=new ArrayList<>();
        for(int candy:candies)
        {
            result.add(candy+extraCandies >= maxCandies);
        }
        return result;
    }
}
package EasyCollection_TopInterviewQuestions.Strings;

import java.util.HashMap;
import java.util.Map;

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution
{
    public boolean isAnagram(String s, String t)
    {
        Map<Character, Integer> count=new HashMap<>();
        for(char c:s.toCharArray())
        {
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        for(char c:t.toCharArray())
        {
            count.put(c, count.getOrDefault(c, 0)-1);
        }
        for(int val:count.values())
        {
            if(val!=0) return false;
        }
        return true;
    }
}
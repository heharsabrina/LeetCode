package EasyCollection_TopInterviewQuestions.Strings;

import java.util.Arrays;

// Time Complexity: O(n log(n))
// Space Complexity: O(1)

class Solution
{
    public boolean isAnagram(String s, String t)
    {
        if(s.length()!=t.length()) return false;

        char[] arrS=s.toCharArray();
        char[] arrT=t.toCharArray();
        
        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
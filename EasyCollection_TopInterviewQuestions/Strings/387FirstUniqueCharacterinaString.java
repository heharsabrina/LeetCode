package EasyCollection_TopInterviewQuestions.Strings;

import java.util.HashMap;

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution
{
    public static void main(String args[])
    {
        String s="leetcode";
        int n=s.length();
        HashMap<Character, Integer> count=new HashMap<Character, Integer>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(count.get(s.charAt(i))==1)
                System.out.println(i+" ");
        }
        System.out.println("-1");
    }
}
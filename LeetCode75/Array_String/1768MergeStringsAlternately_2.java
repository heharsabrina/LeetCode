// Time Complexity: O(m + n) where m is the length of word1 and n is the length of word2.
// Space Complexity: The StringBuilder requires O(n + m) space to store the merged result. Thus, while auxiliary space is O(1), total space complexity is O(n + m).

class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
        int m=word1.length(), n=word2.length();
        StringBuilder sb=new StringBuilder();
        int i=0, j=0;

        while(i<m || j<n)
        {
            if(i<m) sb.append(word1.charAt(i++));
            if(j<n) sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}